import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 public class PhoneBook {
 private Map<String, String> contacts;
 public PhoneBook() {
 contacts = new HashMap<>();
 }
 public void addContact(String name, String phoneNumber) {
 contacts.put(name, phoneNumber);
 System.out.println("Contact added: " + name + " - " + phoneNumber);
 }
 public void removeContact(String name) {
 if (contacts.containsKey(name)) {
 contacts.remove(name);
 System.out.println("Contact removed: " + name);
 } else {
 System.out.println("Contact not found: " + name);
 }
 }
 public void printPhoneBook() {
 if (contacts.isEmpty()) {
 System.out.println("Phone book is empty.");
 } else {
 System.out.println("Phone Book:");
 for (Map.Entry<String, String> entry : contacts.entrySet()) {
 System.out.println(entry.getKey() + ": " + entry.getValue());
 }
 }
 }
 public String getPhoneNumber(String name) {
 return contacts.get(name);
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 PhoneBook phoneBook = new PhoneBook();
 while (true) {
 System.out.println("\nPhone Book Menu:");
 System.out.println("1. Add Contact");
 System.out.println("2. Remove Contact");
 System.out.println("3. Display Phone Book");
 System.out.println("4. Search for Contact");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");

int choice = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character
 switch (choice) {
 case 1:
 System.out.print("Enter name: ");
 String name = scanner.nextLine();
 System.out.print("Enter phone number: ");
 String phoneNumber = scanner.nextLine();
 phoneBook.addContact(name, phoneNumber);
 break;
 case 2:
 System.out.print("Enter name to remove: ");
 String removeName = scanner.nextLine();
 phoneBook.removeContact(removeName);
 break;
 case 3:
 phoneBook.printPhoneBook();
 break;

case 4:
 System.out.print("Enter name to search: ");
 String searchName = scanner.nextLine();
 String foundNumber = phoneBook.getPhoneNumber(searchName);
 if (foundNumber != null) {
 System.out.println("Phone number for " + searchName + ": " + foundNumber);
 } else {
 System.out.println("Contact not found: " + searchName);
 }
 break;
 case 5:
 System.out.println("Exiting Phone Book. Goodbye!");
 scanner.close();
 System.exit(0);
 default:
 System.out.println("Invalid choice. Please enter a number between 1 and 5.");
 }
 }
 }
} 