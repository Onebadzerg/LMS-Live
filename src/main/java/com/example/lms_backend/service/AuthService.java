package com.example.lms_backend.service;

import com.example.lms_backend.model.Member;
import com.example.lms_backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private MemberRepository memberRepository;

    public Member login(String username, String password) {
        Member user = memberRepository.findByMemberName(username);
        if (user != null && user.getMemberPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public Member register(Member newMember) {
        if (memberRepository.findByMemberName(newMember.getMemberName()) != null) {
            return null; // user already exists
        }
        return memberRepository.save(newMember);
    }
}
