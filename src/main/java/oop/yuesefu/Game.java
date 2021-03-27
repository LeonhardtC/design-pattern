package oop.yuesefu;

import java.util.Scanner;

public class Game {
    private Rule rule;
    private Person[] persons;

    public void init() {
        System.out.println("------欢迎进入约瑟夫游戏------");
        setParameter();
        setPersons();
    }

    public void run() {
        System.out.println("-----------游戏开始-----------");
        persons[rule.getStartPersonNumber() - 1].call(1, rule);
    }

    private void setParameter() {
        rule = new Rule();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入参加游戏的人数");
        rule.setPersonCount(scanner.nextInt());
        System.out.println("请输入出局号");
        rule.setMaxNumber(scanner.nextInt());
        System.out.println("请输入开始人序号");
        rule.setStartPersonNumber(scanner.nextInt());
        scanner.close();
    }

    private void setPersons() {
        persons = new Person[rule.getPersonCount()];
        //初始化序号
        for (int i = 0; i < rule.getPersonCount(); i++) {
            persons[i] = new Person();
            persons[i].setNum(i + 1);
        }
        //设置左右边的人
        for (int i = 0; i < rule.getPersonCount(); i++) {
            //第一个人右边为最后一个
            if (i == 0) {
                persons[i].setRightPerson(persons[rule.getPersonCount() - 1]);
            } else {
                persons[i].setRightPerson(persons[i - 1]);
            }
            //最后一个左边为第一个
            if (i == rule.getPersonCount() - 1) {
                persons[i].setLeftPerson(persons[0]);
            } else {
                persons[i].setLeftPerson(persons[i + 1]);
            }
        }
    }
}
