package oop.yuesefu;

public class Person {
    private int num;
    private Person leftPerson;
    private Person rightPerson;

    //叫号
    public void call(int count, Rule rule) {
        if (leftPerson == this && rightPerson == this) {
            System.out.println("我是第" + num + "号，我是最后留下的人。");
            return;
        }

        if (count == rule.getMaxNumber()) {
            out();
            count = 1;
        } else {
            System.out.println("第" + num + "号报数：" + count);
            count++;
        }

        leftPerson.call(count, rule);
    }

    //出局
    private void out() {
        System.out.println("我是第" + num + "号，我出局。");
        leftPerson.setRightPerson(rightPerson);
        rightPerson.setLeftPerson(leftPerson);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Person getLeftPerson() {
        return leftPerson;
    }

    public void setLeftPerson(Person leftPerson) {
        this.leftPerson = leftPerson;
    }

    public Person getRightPerson() {
        return rightPerson;
    }

    public void setRightPerson(Person rightPerson) {
        this.rightPerson = rightPerson;
    }
}
