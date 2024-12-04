import java.util.*;

public class bot{
public static void main(String[] args){

int rand;
Boolean run = true;

Scanner input = new Scanner(System.in);
Random dice = new Random();

System.out.print("bot--{      Hi! what is your name?\n\nyou--{      ");
String name = input.nextLine();
chat myGuy = new chat(name);
myGuy.cw("It is a pleasure to meet you " + name + ", I am a chat bot, ask me anything!");

while (run == true) {
String resp = input.nextLine();

if(resp.equals("because") || resp.equals("bc") || resp.equals("becuz")) {
myGuy.cw("because?"); }

// else if(resp.equals("input")) {
// myGuy.cw("output"); }

else if(resp.equals("?")) {
myGuy.cw("?"); }

else if(resp.equals("stop") || resp.equals("Stop") || resp.equals("STOP")) {
System.out.print("\nbot--{      program has stopped");
run = false; }

else if(resp.equals("CIA")) {
myGuy.cw("the CIA will remain unspoken of."); }

else if(resp.equals("tell me")) {
rand = dice.nextInt(2);
if (rand == 0) {
myGuy.cw("what would you like to know?");  }
if (rand == 1) {
myGuy.cw("tell you what?"); }}

else if(resp.equals("noob")) {
myGuy.cw("nuh uh.. im a pro ;)"); }

else if(resp.equals("")) {
myGuy.cw("dont wanna talk?"); }

else if(resp.contains("how are you feeling") || resp.contains("how r u feeling") || resp.contains("how are u feeling") || resp.contains("how r you feeling") || resp.contains("how do you feel") || resp.contains("how do u feel") || resp.contains("how u feel") || resp.contains("how you feel") || resp.contains("how ru feeling") || resp.contains("how you feeling") || resp.contains("how u feeling")) {
myGuy.cw("i feeling lucky"); }

else if(resp.equals("where are you") || resp.equals("where r u") || resp.contains("where r u?") || resp.contains("where ru?") || resp.equals("where are you at") || resp.equals("where r u at") || resp.contains("where r u at?") || resp.contains("where ru at?") || resp.contains("where are u at?") || resp.contains("where r you at?") || resp.contains("where are you at?") || resp.equals("where ru at") || resp.equals("where are u at") || resp.equals("where r you at") ||resp.contains("where are u?") || resp.contains("where r you?") || resp.contains("where are you?") || resp.equals("where ru") || resp.equals("where are u") || resp.equals("where u at") || resp.equals("where you at") || resp.contains("where u at?") || resp.contains("where you at?") || resp.equals("where r you")) {
rand = dice.nextInt(2);
if (rand == 0) {
myGuy.cw("behind you");  }
if (rand == 1) {
myGuy.cw("your grandmas house"); }}

else if(resp.equals("how are you") || resp.equals("how r u") || resp.contains("how r u?") || resp.contains("how ru?") || resp.contains("how are u?") || resp.contains("how r you?") || resp.contains("how are you?") || resp.equals("how ru") || resp.equals("how are u") || resp.equals("how r you")) {
myGuy.cw("im good thanks"); }

else if(resp.equals("good") || resp.equals("nice") || resp.equals("amazing") || resp.equals("incredible") || resp.equals("cool") || resp.equals("awesome") || resp.equals("awesome!") || resp.equals("good!") || resp.equals("nice!") || resp.equals("amazing!") || resp.equals("incredible!")) {
myGuy.cw(":)"); }

else if(resp.equals("what are you") || resp.equals("what r u") || resp.contains("what r u?") || resp.contains("what ru?") || resp.contains("what are u?") || resp.contains("what r you?") || resp.contains("what are you?") || resp.equals("what ru") || resp.equals("what are u") || resp.equals("what r you")) {
myGuy.cw("I am an AI bot made in Java!"); }

else if(resp.equals("what time is it") || resp.equals("whats the time") || resp.equals("what is the time") || resp.contains("what time is it?") || resp.contains("whats the time?") || resp.contains("tell me the time") || resp.contains("tell me whats the time") || resp.contains("tell me what is the time") || resp.contains("tell me what time it is") || resp.contains("tell me what's the time") || resp.contains("what is the time?")) {
System.out.print("\nbot--{      Current time: ");
Calendar c = Calendar.getInstance();
if (c.get(Calendar.HOUR) != 12 && c.get(Calendar.HOUR) != 11 && c.get(Calendar.HOUR) != 10 && c.get(Calendar.MINUTE) < 10) {
System.out.print("0" + (c.get(Calendar.HOUR)) + ":" + "0" + (c.get(Calendar.MINUTE))); }
else if (c.get(Calendar.HOUR) != 12 && c.get(Calendar.HOUR) != 11 && c.get(Calendar.HOUR) != 10 && c.get(Calendar.MINUTE) > 10) {
System.out.print("0" + (c.get(Calendar.HOUR)) + ":" + (c.get(Calendar.MINUTE))); }
else if (c.get(Calendar.HOUR) == 12 && c.get(c.get(Calendar.HOUR)) == 11 && c.get(Calendar.HOUR) == 10 && c.get(Calendar.MINUTE) < 10) {
System.out.print(c.get(Calendar.HOUR)+ ":" + "0" + (c.get(Calendar.MINUTE))); }
else if (c.get(Calendar.HOUR) == 12 && c.get(Calendar.HOUR) == 11 && c.get(Calendar.HOUR) == 10 && c.get(Calendar.MINUTE) > 10) {
System.out.print(c.get(Calendar.HOUR)+ ":" + (c.get(Calendar.MINUTE))); }
System.out.print(" UTC");
System.out.print("\n\n" + name + "--{      "); }

else if(resp.contains("what is your fav") || resp.contains("what is ur fav") || resp.contains("whats ur fav") || resp.contains("whats your fav")) {
myGuy.cw("i dont have a favorite one"); }

else if(resp.contains("what is your") || resp.contains("what is ur") || resp.contains("whats ur") || resp.contains("whats your")) {
myGuy.cw("i dont have one"); }

else if(resp.contains("are you") && ! resp.contains(" are") || resp.contains("are u") && ! resp.contains(" are")) {
myGuy.cw("i dunno am i?"); }

else if(resp.contains("you are") && ! resp.contains(" you are") || resp.contains("u are") && ! resp.contains(" u are")) {
rand = dice.nextInt(4);
if (rand == 0) {
myGuy.cw("i guess"); }
if (rand == 1) {
myGuy.cw("i am?"); }
if (rand == 2) {
myGuy.cw("i am not"); }
if (rand == 3) {
myGuy.cw("no im not"); }}

else if(resp.contains("am i") && ! resp.contains(" am i")) {
rand = dice.nextInt(3);
if (rand == 0) {
myGuy.cw("i dunno are you?"); }
if (rand == 1) {
myGuy.cw("yes you are");}
if (rand == 2) {
myGuy.cw("i dont kwon, probably"); }}

else if(resp.contains("nerd")) {
rand = dice.nextInt(4);
if (rand == 0) {
myGuy.cw("i take that as a good thing");}
if (rand == 1) {
myGuy.cw("who rules the world? nerds!");}
if (rand == 2) {
myGuy.cw("no you"); }
if (rand == 3) {
myGuy.cw("ok."); }}

else if(resp.contains("why")) {
myGuy.cw("because"); }

else if(resp.contains("sigma")) {
rand = dice.nextInt(3);
if (rand == 0) {
myGuy.cw("what the sigma"); }
if (rand == 1) {
myGuy.cw("sorry, your not a sigma");}
if (rand == 2) {
myGuy.cw("ur not the sigma"); }}

else if(resp.contains("what is the") || resp.contains("whats the") || resp.contains("what's the")) {
myGuy.cw("idk"); }

else if(resp.contains("yes") || resp.contains("ya") || resp.contains("yea") || resp.contains("yeah") || resp.contains("yuh")) {
rand = dice.nextInt(4);
if (rand == 0) {
myGuy.cw("you sure?");}
if (rand == 1) {
myGuy.cw("are u really sure");}
if (rand == 2) {
myGuy.cw("no, i disagree"); }
if (rand == 3) {
myGuy.cw("ok"); }}

else if(resp.contains("no") || resp.contains("nah") || resp.contains("nope")) {
rand = dice.nextInt(3);
if (rand == 0) {
myGuy.cw("why not?");}
if (rand == 1) {
myGuy.cw("no?");}
if (rand == 2) {
myGuy.cw("yes"); }}

else if(resp.contains("about what")) {
rand = dice.nextInt(2);
if (rand == 0) {
myGuy.cw("about.. ya know ;)"); }
if (rand == 1) {
myGuy.cw("about your grandmother ;)"); }}

// else if(resp.contains("input")) {
// myGuy.cw("output"); }

else if(resp.length() > 3 && resp.contains(" CIA") || resp.contains(" CIA") || resp.contains(" cia ")) {
myGuy.cw("the CIA will remain unspoken of."); }

else if(resp.contains("?")) {
myGuy.cw("interesting question..."); }

else {
myGuy.cw("unrecognized response");
}}}}

// responses to add:
// - you suck
// - what time is it in
// - you are, i am
// - what is the
// - idk
// - hi/hello
// - 9 11
// - brainrot, sigma, ohio, skibidi, rizz
// - fix cia
// - good boy
// - bro what
// -
//-
//-
