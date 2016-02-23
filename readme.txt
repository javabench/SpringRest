#SpringRest
##This is sample of CRUD operations on company

###To Create new Company - http://localhost:8080/SpringRest/company
###POST

Sample Data Input - [{"compId":1,"compName":"Tata","address":"BMC","city":"Mumbai","country":"Ind","owners":null,"email":"Admin@tata.com","phone":"990000000"}]]

### List of companies - http://localhost:8080/SpringRest/dbcompanies
###GET
Output - [{"compId":1,"compName":"Tata","address":"BMC","city":"Mumbai","country":"Ind","owners":null,"email":"Admin@tata.com","phone":"990000000"}]


###Get company details by ID - http://localhost:8080/SpringRest/dbcompany/2
###Request Type - GET

Output - [{"compId":1,"compName":"Tata","address":"BMC","city":"Mumbai","country":"Ind","owners":null,"email":"Admin@tata.com","phone":"990000000"}]


### Add the owner(s)  - http://localhost:8080/SpringRest/dbowner
### POST

Sample Data Input - {"ownerId":3,"ownerName":"Pranav Mistri","address":"Mumbai","compId":3}


## Database Details
No DB conf is required.
HSQL in process (in memory) db used, two records are provided at startup via data.sql, later user can add more.

## Test client
SoapUI used for testing POST requests.

####Note:
- Tried Angularjs client, but not working.
- Services could be improved, return newly created record' id.
- for Authentication 
	1) For simple, easier aproach - basic authentication + HTTPS
	2) For enterprise level - OAUTH2