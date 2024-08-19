# Bank Transaction History Viewer

Project where I created an online banking transaction history viewer using Spring MVC where user can click into each transaction to view a new page displaying the full details of that transaction, and from there the user can click back to view the Transaction History page again

## Troubleshooting

This project is entirely dependent upon a _binary_ file cleverly named `doNotTouch`. If this file is moved, renamed, or even changed, then `Transaction.java` will not work and the project will fail to run as intended.

You can always test this by running the unit test provided. If it fails to run green then the file may have been moved or renamed. This unit test will not fail, however, if you change the internals of this binary file.

The rest of this project should conform to your normal expectations for any Spring Boot web project.
