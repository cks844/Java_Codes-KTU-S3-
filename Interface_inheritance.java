//package java_lab;
import java.util.*;
abstract class Animal
{
int legs;
String name;
Animal(int legs)
{
this.legs = legs;
}
abstract void eat();
abstract void walk();
}
interface pet{
String getName();
void setName(String name);
void play();
}
class Spider extends Animal
{
Spider(int legs)
{
super(legs);
}
void walk()
{
System.out.println("Spider walks on "+legs+" legs");
}
void eat()
{
System.out.println("Spider eats insects.");
}
}
class Cat extends Animal implements pet
{
Cat (int legs, String name)
{
super(legs);
this.name = name;
}
public String getName()
{
return name;
}
public void setName(String name) {
this.name = name;
}
public void play()
{
System.out.println("Cat likes to play with a ball.");
}
void eat()
{
System.out.println("Cat eats fishes.");
}
void walk()
{
System.out.println("Cat walks on "+legs+" legs");
}
}
class Fishs extends Animal implements pet{
Fishs(int legs,String name) {
super(legs);
this.name = name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public void play() {
System.out.println("Fish likes to swim around.");
}
void eat() {
System.out.println("Fish eats plants.");
}
void walk()
{
System.out.println("Fish has no legs.");
}
}
public class Interface {
public static void main(String[] args)
{
System.out.println("Spider");
Spider S = new Spider(8);
S.eat();
S.walk();
System.out.println("Fish");
Fishs F = new Fishs(0,"Finley");
System.out.println("This fish's name is "+F.getName());
F.eat();
F.walk();
System.out.println("Cat");
Cat C = new Cat(4,"Leo");
System.out.println("This cat's name is "+C.getName());
C.walk();
C.eat();

}
}
