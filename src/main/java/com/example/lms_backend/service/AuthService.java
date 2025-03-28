
package com.example.lms_backend.service;

import com.example.lms_backend.model.Member;
import com.example.lms_backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private MemberRepository memberRepository;

    public boolean authenticate(String memberName, String password) {
        Member member = memberRepository.findByMemberName(memberName);
        if (member != null && member.getMemberPassword().equals(password)) {
            return true;
        }
        return false;
    }

    public Member register(Member newMember) {
        if (memberRepository.findByMemberName(newMember.getMemberName()) != null) {
            return null; // user already exists
        }
        return memberRepository.save(newMember);
    }
}
