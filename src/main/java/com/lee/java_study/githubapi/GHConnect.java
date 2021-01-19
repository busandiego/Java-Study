package com.lee.java_study.githubapi;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.util.logging.Logger;

public class GHConnect {
    private static final String personToken = "70d7fa5a5a89f15fcbc9557c3876b7d109e87260";
    private static GHConnect con = new GHConnect();
    private Logger LOG = Logger.getGlobal();
    private static GitHub gitHub;

    private GHConnect(){
        LOG.info("GHConnect 객체 생성 중");

        try { // 깃허브 객체 생성
            this.gitHub = new GitHubBuilder().withOAuthToken(personToken).build();
            LOG.info("깃 계정 연결 성공");
        } catch (Exception e) {
            LOG.info("깃 계정 연결 실패. 재연결이 필요합니다");
        }
    }

        public static GitHub getConnection(){
            return gitHub;
        }
}
