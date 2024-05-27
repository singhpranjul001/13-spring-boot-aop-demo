package com.practice.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ": Doing my DB Work: Adding a membership account.");
        return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": I am going to sleep now.....");
    }
}
