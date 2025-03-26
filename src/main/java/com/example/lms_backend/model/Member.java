package com.example.lms_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_password")
    private String memberPassword;

    @Column(name = "member_email")
    private String memberEmail;

    @Column(name = "member_hp")
    private String memberHp;

    @Column(name = "is_admin")
    private String isAdmin;

    // Getters and Setters

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberHp() {
        return memberHp;
    }

    public void setMemberHp(String memberHp) {
        this.memberHp = memberHp;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
