package Modification;
import  Modification.Package1.*;

public class Test {

    public int id;
    public static void main(String[] args) {
        // public, private,default, protected
        // pubic предоставляет доступ в рамках всего проекта
        // private предоставляяет доступ в рамках класса
        // default устанавливается по умолчанию и предоставляет доступ в рамках пакета
        // protected предоставляет доступ в рамках одного пакета, и подклассов (даже если они в дркгих пакетах)

        Person person1 = new Person();

    }
}
