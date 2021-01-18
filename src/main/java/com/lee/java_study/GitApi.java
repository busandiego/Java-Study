package com.lee.java_study;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.*;

public class GitApi {

    public static final String GITTOKEN = "37f9be7a106c9b9b9385e31d50359ab7a576899e";
    public static final String ID = "star1606";

    public static void main(String[] args) throws IOException {

        final String repoName = "whiteship/live-study"; // gitRepository name

        /*
        * @param userId
        * @param gitAccessToken
        * */

       final GitHub gitHub = new GitHubBuilder().withPassword(ID, GITTOKEN).build();


       // github connection check
        try {
            gitHub.checkApiUrlValidity();
        }  catch (Exception e) {
            throw new IOException("Check your github gitToken & username");
        }

        // 한개의 레파지토리에서 이슈사항들을 List에 담고 이슈사항이 존재하지 않는다면, IndexOutofBoundException 처리
        List<GHIssue> issues = gitHub.getRepository(repoName).getIssues(GHIssueState.ALL);
        if(issues.size() == 0){
            throw new IndexOutOfBoundsException("There is no repository's issue.");
        }

        List<String> usernames = new ArrayList<>();
        // 1개의 이슈에 커맨트들의 로그인 아아디를 전부 분석하여, username String List에 넣어준다.

        /*
        issues {
            issue_1{
                comments{
                    comment_1{
                        List<String> username <- add.comment.userId
                    }
                    comment_2{
                        List<String> username <- add.comment.userId
                    }
                }
            }
            issue_2{
                comments{
                    comment_1{
                        List<String> username <- add.comment.userId
                    }
                    comment_2{
                        List<String> username <- add.comment.userId
                    }
                }
            }
        }
        */

        // 인덱스를 통한 조회
        //String element0 = issues.get(0).toString();


        for(GHIssue issue : issues) {
            List<String> checkDuplicateList = new ArrayList<>();
            for(GHIssueComment comment : issue.getComments()){
                usernames.add(comment.getUser().getLogin());
            }
        }

        HashMap<String, Integer> results = new HashMap<String, Integer>();

        // containsKey(name); 해쉬맵에 키가 있는지
        // containsValue(name); 해쉬맵에 값이 있는지

        for(String name : usernames) {
            if(results.containsKey(name)){ // if there is duplicate name
                System.out.println("results.get(name)의 값은 : " + results.get(name));
                results.put(name, results.get(name) + 1); // 왜 1을 더하는지 잘모르겠다.
            } else { // if there is not name
                results.put(name, 1);
            }
        }

        // Map에 저장되는 key-value쌍을 다루기 위해 내부적으로 Entry 인터페이스를 정의해놓은 것.
        // Map.Entry 인터페이스의 메서드 : 리턴타입이 boolean인 경우 작업을 성공하거나 사실이면 true, 그렇지 않으면 false를 반환
        for(Map.Entry<String, Integer> entry : results.entrySet()) {

            //Entry의 value객체를 반환 entry.getValue();
            double percent = Math.round(entry.getValue()/(double)issues.size()*100.0*100.0)/100.0;
            System.out.println("User : '" + entry.getKey() + "' issueProgress : '" + percent + "%'");

        }

    }
}
