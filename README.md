# Home Screen
<img width="885" alt="Screenshot 2024-05-15 at 10 30 27 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/454aec88-efe6-4d69-9599-c6a8097d5e67">

## Search Methods
<img width="885" alt="Screenshot 2024-05-15 at 10 31 33 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/e455eecd-3008-4ac7-8ac5-1677b70cd941">
<img width="885" alt="Screenshot 2024-05-15 at 10 31 44 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/af57f5ac-bd58-4a28-922a-e92774ebee08">
<img width="995" alt="Screenshot 2024-05-15 at 10 49 40 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/b0f49557-3ca1-46d9-838b-5aeca5b1d7d4">
<img width="885" alt="Screenshot 2024-05-15 at 10 31 58 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/c3fec040-b252-4f9f-b055-780782c2fa9b">
<img width="885" alt="Screenshot 2024-05-15 at 10 33 55 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/a7351d27-bf41-4f4d-a019-89471a3435ed">
<img width="885" alt="Screenshot 2024-05-15 at 10 34 45 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/132cdb31-0931-4450-bc2b-b82da9e59654">

## Add / Remove
<img width="885" alt="Screenshot 2024-05-15 at 10 36 31 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/7a81f943-4274-4c0f-ad01-55dfdf2ed531">
<img width="885" alt="Screenshot 2024-05-15 at 10 36 52 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/946e6b6f-dd8c-48ef-801e-565401438e1f">
<img width="885" alt="Screenshot 2024-05-15 at 10 37 02 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/4fd00c3c-54f9-4cba-a316-1fe0ba5bcb4d">

## Exit App
<img width="885" alt="Screenshot 2024-05-15 at 10 40 23 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/23a4c687-57fb-40cb-9db4-8fe5f2a54b7c">

## File
<img width="765" alt="Screenshot 2024-05-15 at 10 41 39 PM" src="https://github.com/nuhiii/WorkshopFour_CarDealership/assets/143645213/b77e0022-f7d5-49d4-b076-0522d9521eba">

# Interesting Code
```java
// As stated this method will overwrite the file with the current dealership info and inventory list
public void saveDealership(Dealership dealership, String filePath) {
BufferedWriter buffWriter = new BufferedWriter(new FileWriter(filePath));
// REST OF CODE
}
```
- This whole method is interesting as it makes you wonder if it is better to append to the file vs overwrite it when technically you can reflect changes either way in this case
