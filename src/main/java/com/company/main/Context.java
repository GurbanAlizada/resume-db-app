package com.company.main;

import com.company.dao.impl.*;
import com.company.dao.inter.*;

public class Context {

    public static UserSkillDaoInter instanceUseSkillDao(){
        return new UserSkillIDaompl();
    }

    public static UserDaoInter instanceUserDao(){
        return new UserDaoImpl();
    }

    public static SkillDaoInter instanceSkilllDao(){
        return new SkillDaoImpl();
    }

    public static EmploymentHistoryDaoInter instanceEmploymentHistoryDao(){
        return new EmploymentHistoryDaoImpl();
    }


    public static CountryDaoInter instanceCountryDao(){
        return new CountryDaoImpl();
    }





}
