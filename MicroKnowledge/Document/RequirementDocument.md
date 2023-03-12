# 1   Introduction
## 1.1   Purpose
This subsection should

- a) Delineate the purpose of the SRS;
- b) Specify the intended audience for the SRS.
## 1.2   Scope
Name of software to be developed: MicroKnowledge System

This subsection should

- b) Explain what the software product(s) will, and, if necessary, will not do;
- c) Describe the application of the software being specifified, including relevant benefifits, objectives, and goals;
- d) Be consistent with similar statements in higher-level specififications (e.g., the system requirements specifification), if they exist.
## 1.3   Product Overview

### 1.3.1  Product perspective
This subsection of the SRS should put the product into perspective with other related products. If the product is independent and totally self-contained, it should be so stated here. If the SRS defines a product that is a component of a larger system, as frequently occurs, then this subsection should relate the requirements of that larger system to functionality of the software and should identify interfaces between that system and the software.

This subsection should also describe how the software operates inside various constraints. For example,
these constraints could include
- a) System interfaces;
- b) User interfaces;
- c) Hardware interfaces;
- d) Software interfaces;
- e) Communications interfaces;
- f) Memory;
- j) Operations;
- k) Site adaptation requirements.
#### 1.3.1.1   System interfaces
<b>SI1 - MicroKnowledgeSystem</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI1</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPlogIn">logIn</a></li><li><a href="#OPsearchUserByName">searchUserByName</a></li><li><a href="#OPlistMicroknowledgeOfUser">listMicroknowledgeOfUser</a></li><li><a href="#OPsearchMicroknowledge">searchMicroknowledge</a></li><li><a href="#OPviewMicroknowledge">viewMicroknowledge</a></li><li><a href="#OPwriteComment">writeComment</a></li><li><a href="#OPstarMicroknowledge">starMicroknowledge</a></li><li><a href="#OPlistStaredMicroknowledge">listStaredMicroknowledge</a></li></ul></td>
	</tr>
<tr>
			<td><b>Temporary Variable</b></td>
			<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name ="MicroKnowledgeSystemCurrentUser">CurrentUser</span></td>
		<td>CurrentUser is a object of <a href="#CLASSUser">User</a></td>
					</tr>
	<tr>
		<td><span name ="MicroKnowledgeSystemCurrentMicroknowledge">CurrentMicroknowledge</span></td>
		<td>CurrentMicroknowledge is a object of <a href="#CLASSMicroknowledge">Microknowledge</a></td>
					</tr>
	</table>

<b>SI2 - ManageUserService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManageUserService">ManageUserService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI2</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPcreateUser">createUser</a></li></ul></td>
	</tr>
	</table>

<b>SI3 - ManageMicroknowledgeService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManageMicroknowledgeService">ManageMicroknowledgeService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI3</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPcreateMicroknowledge">createMicroknowledge</a></li><li><a href="#OPmodifyMicroknowledge">modifyMicroknowledge</a></li></ul></td>
	</tr>
	</table>

<b>SI4 - SearchMicroknowledgeService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICESearchMicroknowledgeService">SearchMicroknowledgeService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI4</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPsearchMicroknowledge">searchMicroknowledge</a></li><li><a href="#OPviewMicroknowledge">viewMicroknowledge</a></li></ul></td>
	</tr>
	</table>

<b>SI5 - ListMicroknowledgeOfUserService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEListMicroknowledgeOfUserService">ListMicroknowledgeOfUserService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI5</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPsearchUserByName">searchUserByName</a></li><li><a href="#OPlistMicroknowledgeOfUser">listMicroknowledgeOfUser</a></li></ul></td>
	</tr>
	</table>

<b>SI6 - ThirdPartyServices</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEThirdPartyServices">ThirdPartyServices</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI6</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul></ul></td>
	</tr>
	</table>
​	 

### 1.3.2  Product functions
<b>Use Case Diagram</b>

![Use Case Diagram](Images/Use_Case_Diagram.svg)

<table>
	<tr>
		<td><b>ID</b></td>
		<td><b>Use Case Name</b></td>
		<td><b>Use Case Description</b></td>
		<td><b>Subfunction</b></td>
	</tr>
	<tr>
		<td>UC1</td>
		<td><a href="#UCsearchMicroknowledge">searchMicroknowledge</a></td>
		<td></td>
		<td>
		<p><a href="#OPsearchMicroknowledge">searchMicroknowledge</a></p><p><a href="#OPviewMicroknowledge">viewMicroknowledge</a></p>
		</td>
	</tr>
	<tr>
		<td>UC2</td>
		<td><a href="#UCstarMicroknowledge">starMicroknowledge</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC3</td>
		<td><a href="#UCwriteComment">writeComment</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC4</td>
		<td><a href="#UClistMicroknowledgeOfUser">listMicroknowledgeOfUser</a></td>
		<td></td>
		<td>
		<p><a href="#OPsearchUserByName">searchUserByName</a></p><p><a href="#OPlistMicroknowledgeOfUser">listMicroknowledgeOfUser</a></p>
		</td>
	</tr>
	<tr>
		<td>UC5</td>
		<td><a href="#UClistStaredMicroknowledge">listStaredMicroknowledge</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC6</td>
		<td><a href="#UCmanageMicroknowledge">manageMicroknowledge</a></td>
		<td></td>
		<td>
		<p><a href="#OPcreateMicroknowledge">createMicroknowledge</a></p><p><a href="#OPmodifyMicroknowledge">modifyMicroknowledge</a></p>
		</td>
	</tr>
	<tr>
		<td>UC7</td>
		<td><a href="#UCmanageUser">manageUser</a></td>
		<td></td>
		<td>
		<p><a href="#OPcreateUser">createUser</a></p>
		</td>
	</tr>
	<tr>
		<td>UC8</td>
		<td><a href="#UClogIn">logIn</a></td>
		<td></td>
		<td>
		</td>
	</tr>
</table>
### 1.3.3  User characteristics

<table>
	<tr>
		<td><b>ID</b></td>
		<td><b>Actor</b></td>
		<td><b>Description</b></td>
		<td><b>Super Actor</b></td>
	</tr>
	<tr>
		<td>A1</td>
		<td><span name ="ACTORUploader">Uploader</span></td>
		<td></td>
		<td><a href="#ACTORUser">User</a></td>
	</tr><tr>
		<td>A2</td>
		<td><span name ="ACTORReader">Reader</span></td>
		<td></td>
		<td><a href="#ACTORUser">User</a></td>
	</tr><tr>
		<td>A3</td>
		<td><span name ="ACTORAdministrator">Administrator</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A4</td>
		<td><span name ="ACTORUser">User</span></td>
		<td></td>
		<td></td>
	</tr>
</table>

### 1.3.4 Limitations
This subsection of the SRS should provide a general description of any other items that will limit the developer’s options. These include

- a) Regulatory policies;
- b) Hardware limitations (e.g., signal timing requirements);
- c) Interfaces to other applications;
- d) Parallel operation;
- e) Audit functions;
- f) Control functions;
- g) Higher-order language requirements;
- h) Signal handshake protocols (e.g., XON-XOFF, ACK-NACK);
- i) Reliability requirements;
- j) Criticality of the application;
- k) Safety and security considerations.
- l) physical/mental considerations; and
- m) limitations that are sourced from other systems, including real-time requirements from the controlled system through interfaces.

## 1.4   Definitions
This subsection should provide the defifinitions of all terms required to properly interpret the SRS. This information may be provided by reference to one or more appendixes in the SRS or by reference to other documents.

# 2  References
This subsection should

- a) Provide a complete list of all documents referenced elsewhere in the SRS;
- b) Identify each document by title, report number (if applicable), date, and publishing organization;
- c) Specify the sources from which the references can be obtained.

This information may be provided by reference to an appendix or to another document.

# 3  Requirements
## 3.1  Functions
### 3.1.1   Use Case
<b>UC1 - searchMicroknowledge</b>
<p>System Sequence Diagram:</p>

![SearchMicroknowledgeSSD](Images/SearchMicroknowledgeSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCsearchMicroknowledge">searchMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC1</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORReader">Reader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td><p>1. Reader clicks to execute the operation <a href="#OPsearchMicroknowledge">searchMicroknowledge</a>, with entering keywords</p><p>2. Reader clicks to execute the operation <a href="#OPviewMicroknowledge">viewMicroknowledge</a>, with entering id</p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC2 - starMicroknowledge</b>
<p>System Sequence Diagram:</p>

![StarMicroknowledgeSSD](Images/StarMicroknowledgeSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCstarMicroknowledge">starMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC2</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORReader">Reader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td><p>1. Reader clicks to execute the operation <a href="#OPviewMicroknowledge">viewMicroknowledge</a>, with entering id</p><p>2. Reader clicks to execute the operation <a href="#OPstarMicroknowledge">starMicroknowledge</a></p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC3 - writeComment</b>
<p>System Sequence Diagram:</p>

![WriteCommentSSD](Images/WriteCommentSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCwriteComment">writeComment</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC3</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORReader">Reader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td><p>1. Reader clicks to execute the operation <a href="#OPviewMicroknowledge">viewMicroknowledge</a>, with entering id</p><p>2. Reader clicks to execute the operation <a href="#OPwriteComment">writeComment</a>, with entering content</p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC4 - listMicroknowledgeOfUser</b>
<p>System Sequence Diagram:</p>

![ListMicroknowledgeOfUserSSD](Images/ListMicroknowledgeOfUserSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UClistMicroknowledgeOfUser">listMicroknowledgeOfUser</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC4</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORReader">Reader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td><p>1. Reader clicks to execute the operation <a href="#OPsearchUserByName">searchUserByName</a>, with entering name</p><p>2. Reader clicks to execute the operation <a href="#OPlistMicroknowledgeOfUser">listMicroknowledgeOfUser</a>, with entering id</p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC5 - listStaredMicroknowledge</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UClistStaredMicroknowledge">listStaredMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC5</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORReader">Reader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC6 - manageMicroknowledge</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanageMicroknowledge">manageMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC6</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORUploader">Uploader</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC7 - manageUser</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanageUser">manageUser</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC7</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORAdministrator">Administrator</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>

<b>UC8 - logIn</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UClogIn">logIn</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC8</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORUser">User</a></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol></ol></td>
	</tr>
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol></ol></td>
	</tr>						
	<tr>
		<td><b>Basic Path:</b></td>
	<td></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>


### 3.1.2   System Operation
<b>OP1 - createUser</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreateUser">createUser</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP1</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEManageUserService">ManageUserService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: String</p><p>2. name: <i>password</i>, type: String</p><p>3. name: <i>name</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>up</i> is the object <i>u</i> in the instance set of class <a href="#CLASSUser">User</a>. <i>u</i> represents an object of class <a href="#CLASSUser">User</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>up</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>user</i> represented the object of class <a href="#CLASSUser">User</a></p><p>2. The object <i>user</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>user</i> became <i>id</i></p><p>4. The attribute <i>Password</i> of the object <i>user</i> became <i>password</i></p><p>5. The attribute <i>Name</i> of the object <i>user</i> became <i>name</i></p><p>6. The object <i>user</i> was put into the instance set of class <a href="#CLASSUser">User</a></p><p>7. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createUser</b>:</p>

```java
Contract ManageUserService::createUser(id : String, password : String, name : String) : Boolean {
		definition:
			up:User = User.allInstance()->any(u:User | u.Id = id)
		precondition:
			up.oclIsUndefined() = true
		postcondition:
			let user:User in
			user.oclIsNew() and
			user.Id = id and
			user.Password = password and
			user.Name = name and
			User.allInstance()->includes(user) and
			result = true
}
```

<b>OP2 - logIn</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPlogIn">logIn</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP2</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>userId</i>, type: String</p><p>2. name: <i>password</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>user</i> is the object <i>u</i> in the instance set of class <a href="#CLASSUser">User</a>. <i>u</i> represents an object of class <a href="#CLASSUser">User</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>userId</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>user</i> exists</p><p>2. The attribute <i>Password</i> of the object <i>user</i> is equal to <i>password</i></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The object <a href="#MicroKnowledgeSystemCurrentUser">CurrentUser</a> became <i>user</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>logIn</b>:</p>

```java

```

<b>OP3 - createMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreateMicroknowledge">createMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP3</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEManageMicroknowledgeService">ManageMicroknowledgeService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: String</p><p>2. name: <i>keywords</i>, type: String</p><p>3. name: <i>content</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>microknowledge</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMicroknowledge">Microknowledge</a>. <i>m</i> represents an object of class <a href="#CLASSMicroknowledge">Microknowledge</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>microknowledge</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>mk</i> represented the object of class <a href="#CLASSMicroknowledge">Microknowledge</a></p><p>2. The object <i>mk</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>mk</i> became <i>id</i></p><p>4. The attribute <i>Keywords</i> of the object <i>mk</i> became <i>keywords</i></p><p>5. The attribute <i>Content</i> of the object <i>mk</i> became <i>content</i></p><p>6. The attribute <i>StarNumber</i> of the object <i>mk</i> became <b>0</b></p><p>7. The attribute <i>LastEditTime</i> of the object <i>mk</i> was equal to <i>Now</i></p><p>8. The object <i>CurrentUser</i> was linked to the object <i>mk</i> by <i>ContainedMicroknowledge</i></p><p>9. The object <i>mk</i> was linked to the object <i>CurrentUser</i> by <i>BelongedUser</i></p><p>10. The object <i>mk</i> was put into the instance set of class <a href="#CLASSMicroknowledge">Microknowledge</a></p><p>11. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createMicroknowledge</b>:</p>

```java
Contract ManageMicroknowledgeService::createMicroknowledge(id : String, keywords : String, content : String) : Boolean {
		definition:
			microknowledge:Microknowledge = Microknowledge.allInstance()->any(m:Microknowledge | m.Id = id)
		precondition:
			microknowledge.oclIsUndefined() = true
		postcondition:
			let mk:Microknowledge in
			mk.oclIsNew() and
			mk.Id = id and
			mk.Keywords = keywords and
			mk.Content = content and
			mk.StarNumber = 0 and
			mk.LastEditTime.isEqual(Now) and
			CurrentUser.ContainedMicroknowledge->includes(mk) and
			mk.BelongedUser = CurrentUser and
			Microknowledge.allInstance()->includes(mk) and
			result = true
}
```

<b>OP4 - modifyMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPmodifyMicroknowledge">modifyMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP4</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEManageMicroknowledgeService">ManageMicroknowledgeService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: String</p><p>2. name: <i>keywords</i>, type: String</p><p>3. name: <i>content</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>mk</i> is the object <i>m</i> in all objects which <i>CurrentUser</i> is linked to by <i>ContainedMicroknowledge</i>. <i>m</i> represents an object of class <a href="#CLASSMicroknowledge">Microknowledge</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>mk</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Id</i> of the object <i>mk</i> became <i>id</i></p><p>2. The attribute <i>Keywords</i> of the object <i>mk</i> became <i>keywords</i></p><p>3. The attribute <i>Content</i> of the object <i>mk</i> became <i>content</i></p><p>4. The attribute <i>StarNumber</i> of the object <i>mk</i> became its previous value</p><p>5. The attribute <i>LastEditTime</i> of the object <i>mk</i> was equal to <i>Now</i></p><p>6. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>modifyMicroknowledge</b>:</p>

```java
Contract ManageMicroknowledgeService::modifyMicroknowledge(id : String, keywords : String, content : String) : Boolean {
		definition:
			mk:Microknowledge = CurrentUser.ContainedMicroknowledge->any(m:Microknowledge | m.Id = id)
		precondition:
			mk.oclIsUndefined() = false
		postcondition:
			mk.Id = id and
			mk.Keywords = keywords and
			mk.Content = content and
			mk.StarNumber = mk.StarNumber@pre and
			mk.LastEditTime.isEqual(Now) and
			result = true
}
```

<b>OP5 - searchUserByName</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPsearchUserByName">searchUserByName</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP5</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>name</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of User</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The <i>name</i> is not equal to <b>null</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSUser">User</a>, including all <i>u</i> in the instance set of class <a href="#CLASSUser">User</a>. <i>u</i> represented an object of class <a href="#CLASSUser">User</a>, and <i>u</i> meet:</p><p>&emsp;&emsp;The attribute <i>Name</i> of the object <i>u</i> was equal to <i>name</i></p></td>
	</tr>
</table>

<p>Contract of <b>searchUserByName</b>:</p>

```java
Contract MicroKnowledgeSystem::searchUserByName(name : String) : Set(User) {
		precondition:
			name <> ""
		postcondition:
			result = User.allInstance()->select(u:User| u.Name = name)
}
```

<b>OP6 - listMicroknowledgeOfUser</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPlistMicroknowledgeOfUser">listMicroknowledgeOfUser</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP6</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of Microknowledge</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>user</i> is the object <i>u</i> in the instance set of class <a href="#CLASSUser">User</a>. <i>u</i> represents an object of class <a href="#CLASSUser">User</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>user</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the object which <i>user</i> was linked to by <i>ContainedMicroknowledge</i></p></td>
	</tr>
</table>

<p>Contract of <b>listMicroknowledgeOfUser</b>:</p>

```java
Contract MicroKnowledgeSystem::listMicroknowledgeOfUser(id : String) : Set(Microknowledge) {
		definition:
			user:User = User.allInstance()->any(u:User | u.Id = id)
		precondition:
			user.oclIsUndefined() = false
		postcondition:
			result = user.ContainedMicroknowledge
}
```

<b>OP7 - searchMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPsearchMicroknowledge">searchMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP7</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>keywords</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of Microknowledge</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The <i>keywords</i> is not equal to <b>null</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSMicroknowledge">Microknowledge</a>, including all <i>mk</i> in the instance set of class <a href="#CLASSMicroknowledge">Microknowledge</a>. <i>mk</i> represented an object of class <a href="#CLASSMicroknowledge">Microknowledge</a>, and <i>mk</i> meet:</p><p>&emsp;&emsp;The attribute <i>Keywords</i> of the object <i>mk</i> was equal to <i>keywords</i></p></td>
	</tr>
</table>

<p>Contract of <b>searchMicroknowledge</b>:</p>

```java
Contract MicroKnowledgeSystem::searchMicroknowledge(keywords:String) : Set(Microknowledge) {
		precondition:
			keywords <> ""
		postcondition:
			result = Microknowledge.allInstance()->select(mk:Microknowledge| mk.Keywords = keywords)
}
```

<b>OP8 - viewMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPviewMicroknowledge">viewMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP8</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td><a href="#CLASSMicroknowledge">Microknowledge</a></td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>mk</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMicroknowledge">Microknowledge</a>. <i>m</i> represents an object of class <a href="#CLASSMicroknowledge">Microknowledge</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>mk</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. ERROR12</p><p>2. The return value was <i>mk</i></p></td>
	</tr>
</table>

<p>Contract of <b>viewMicroknowledge</b>:</p>

```java
Contract MicroKnowledgeSystem::viewMicroknowledge(id : String) : Microknowledge {
		definition:
			mk:Microknowledge = Microknowledge.allInstance()->any(m:Microknowledge | m.Id = id)
		precondition:
			mk.oclIsUndefined() = false
		postcondition:
			CurrentMicroknowledge = mk and
			result = mk
}
```

<b>OP9 - starMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPstarMicroknowledge">starMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP9</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td>None</td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>CurrentMicroknowledge</i> exists</p><p>2. The object <i>CurrentUser</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The object <i>CurrentUser</i> was linked to the object <i>CurrentMicroknowledge</i> by <i>StaredMicroknowledge</i></p><p>2. The attribute <i>StarNumber</i> of the object <i>CurrentMicroknowledge</i> became its previous value plus <b>1</b></p><p>3. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>starMicroknowledge</b>:</p>

```java
Contract MicroKnowledgeSystem::starMicroknowledge() : Boolean {
		precondition:
			CurrentMicroknowledge.oclIsUndefined() = false and
			CurrentUser.oclIsUndefined() = false
		postcondition:
			CurrentUser.StaredMicroknowledge->includes(CurrentMicroknowledge) and
			CurrentMicroknowledge.StarNumber = CurrentMicroknowledge.StarNumber@pre+1 and
			result = true
}
```

<b>OP10 - writeComment</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPwriteComment">writeComment</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP10</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>content</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>CurrentMicroknowledge</i> exists</p><p>2. The object <i>CurrentUser</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>comment</i> represented the object of class <a href="#CLASSComment">Comment</a></p><p>2. The object <i>comment</i> was created</p><p>3. The attribute <i>Content</i> of the object <i>comment</i> became <i>content</i></p><p>4. The attribute <i>WritingTime</i> of the object <i>comment</i> was equal to <i>Now</i></p><p>5. The object <i>comment</i> was put into the instance set of class <a href="#CLASSComment">Comment</a></p><p>6. The object <i>CurrentMicroknowledge</i> was linked to the object <i>comment</i> by <i>ContainedComment</i></p><p>7. The object <i>comment</i> was linked to the object <i>CurrentMicroknowledge</i> by <i>CommenttoMicroknowledge</i></p><p>8. The object <i>CurrentUser</i> was linked to the object <i>comment</i> by <i>ReadertoComment</i></p><p>9. The object <i>comment</i> was linked to the object <i>CurrentUser</i> by <i>CommenttoReader</i></p><p>10. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>writeComment</b>:</p>

```java
Contract MicroKnowledgeSystem::writeComment(content:String) : Boolean {
		precondition:
			CurrentMicroknowledge.oclIsUndefined() = false and
			CurrentUser.oclIsUndefined() = false
		postcondition:
			let comment:Comment in
			comment.oclIsNew() and
			comment.Content = content and
			comment.WritingTime.isEqual(Now) and
			Comment.allInstance()->includes(comment) and
			CurrentMicroknowledge.ContainedComment->includes(comment) and
			comment.CommenttoMicroknowledge = CurrentMicroknowledge and
			CurrentUser.ReadertoComment->includes(comment) and
			comment.CommenttoReader = CurrentUser and
			result = true
}
```

<b>OP11 - listStaredMicroknowledge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPlistStaredMicroknowledge">listStaredMicroknowledge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP11</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEMicroKnowledgeSystem">MicroKnowledgeSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td>None</td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of Microknowledge</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>CurrentUser</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the object which <i>CurrentUser</i> was linked to by <i>StaredMicroknowledge</i></p></td>
	</tr>
</table>

<p>Contract of <b>listStaredMicroknowledge</b>:</p>

```java
Contract MicroKnowledgeSystem::listStaredMicroknowledge() : Set(Microknowledge) {
		precondition:
			CurrentUser.oclIsUndefined() = false
		postcondition:
			result = CurrentUser.StaredMicroknowledge
}
```


## 3.2  Database requirements
#### 3.2.1   Entity Analysis
<b>Conceptual Class Diagram</b> 

![image-20220523102751286](RequirementDocument.assets/image-20220523102751286.png)

<b>E1 - User</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSUser">User</span></td>
	</tr>
	<tr>
		<td><b>Entity ID:</b></td>
		   <td colspan="2">E1</td>
	</tr>
	<tr>
	    <td><b>Entity Description:</b></td>
	    <td colspan="2"></td>
	</tr>
	<tr>
	    <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td><b>Attribute Description</b></td>
	</tr>
	<tr>
	    <td>Id</td>
	<td>String</td>
	<td>The Id of User</td>
					</tr>
	<tr>
	    <td>Password</td>
	<td>String</td>
	<td>The Password of User</td>
					</tr>
	<tr>
	    <td>Name</td>
	<td>String</td>
	<td>The Name of User</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>StaredMicroknowledge</td>
		<td><a href="#CLASSMicroknowledge">Microknowledge</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	<tr>
		<td>ReadertoComment</td>
		<td><a href="#CLASSComment">Comment</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	<tr>
		<td>ContainedMicroknowledge</td>
		<td><a href="#CLASSMicroknowledge">Microknowledge</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	</table>

<b>E2 - Microknowledge</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSMicroknowledge">Microknowledge</span></td>
	</tr>
	<tr>
		<td><b>Entity ID:</b></td>
		   <td colspan="2">E2</td>
	</tr>
	<tr>
	    <td><b>Entity Description:</b></td>
	    <td colspan="2"></td>
	</tr>
	<tr>
	    <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td><b>Attribute Description</b></td>
	</tr>
	<tr>
	    <td>Id</td>
	<td>String</td>
	<td>The Id of Microknowledge</td>
					</tr>
	<tr>
	    <td>Keywords</td>
	<td>String</td>
	<td>The Keywords of Microknowledge</td>
					</tr>
	<tr>
	    <td>Content</td>
	<td>String</td>
	<td>The Content of Microknowledge</td>
					</tr>
	<tr>
	    <td>StarNumber</td>
	<td>Integer</td>
	<td>The StarNumber of Microknowledge</td>
					</tr>
	<tr>
	    <td>LastEditTime</td>
	<td>LocalDate</td>
	<td>The LastEditTime of Microknowledge</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>BelongedUser</td>
		<td><a href="#CLASSUser">User</a></td>
		<td>Association: One-to-One</td>
	</tr>
	<tr>
		<td>ContainedComment</td>
		<td><a href="#CLASSComment">Comment</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	</table>

<b>E3 - Comment</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSComment">Comment</span></td>
	</tr>
	<tr>
		<td><b>Entity ID:</b></td>
		   <td colspan="2">E3</td>
	</tr>
	<tr>
	    <td><b>Entity Description:</b></td>
	    <td colspan="2"></td>
	</tr>
	<tr>
	    <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td><b>Attribute Description</b></td>
	</tr>
	<tr>
	    <td>Content</td>
	<td>String</td>
	<td>The Content of Comment</td>
					</tr>
	<tr>
	    <td>WritingTime</td>
	<td>LocalDate</td>
	<td>The WritingTime of Comment</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>CommenttoReader</td>
		<td><a href="#CLASSUser">User</a></td>
		<td>Association: One-to-One</td>
	</tr>
	<tr>
		<td>CommenttoMicroknowledge</td>
		<td><a href="#CLASSMicroknowledge">Microknowledge</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>
​	 

#### 3.2.2   Other database requirements
This should specify the logical requirements for any information that is to be placed into a database. This may include the following:

- a) Types of information used by various functions;
- b) Frequency of use;
- c) Accessing capabilities;
- d) Integrity constraints;
- e) Data retention requirements.			


## 3.3  Performance requirements
### 3.3.1  Static numerical requirements
This subsection should specify both the static and the dynamic numerical requirements placed on the software or on human interaction with the software as a whole. Static numerical requirements may include the following:

- a) The number of terminals to be supported;
- b) The number of simultaneous users to be supported;
- c) Amount and type of information to be handled.
### 3.3.2  Dynamic numerical requirements
Dynamic numerical requirements may include, for example, the numbers of transactions and tasks and the amount of data to be processed within certain time periods for both normal and peak workload conditions.

All of these requirements should be stated in measurable terms.

For example, 

- *95% of the transactions shall be processed in less than 1 s.*

rather than,

- *An operator shall not have to wait for the transaction to complete.*

NOTE:Numerical limits applied to one specifific function are normally specifified as part of the processing subparagraph description of that function. 

## 3.4  Usability requirements
Define usability and quality in use requirements and objectives for the software system that can include measurable effectiveness, efficiency, satisfaction criteria and avoidance of harm that could arise from use in specific contexts of use.
## 3.5  Interface requirements
### 3.5.1  User interfaces
This should specify the following:
- a) The logical characteristics of each interface between the software product and its users. This includes those configuration characteristics (e.g., required screen formats, page or window layouts, content of any reports or menus, or availability of programmable function keys) necessary to accomplish the software requirements.
- b) All the aspects of optimizing the interface with the person who must use the system. This may simply comprise a list of do’s and don’ts on how the system will appear to the user. One example may be a requirement for the option of long or short error messages. Like all others, these requirements should be verifiable, e.g., “a clerk typist grade 4 can do function X in Z min after 1 h of training” rather than “a typist can do function X.” (This may also be specified in the Software System Attributes under a section titled Ease of Use.) 
### 3.5.2  Hardware interfaces
This should specify the logical characteristics of each interface between the software product and the hardware components of the system. This includes configuration characteristics (number of ports, instruction sets, etc.). It also covers such matters as what devices are to be supported, how they are to be supported, and protocols. For example, terminal support may specify full-screen support as opposed to line-by-line support.
### 3.5.3  Software interfaces
This should specify the use of other required software products (e.g., a data management system, an operating system, or a mathematical package), and interfaces with other application systems (e.g., the linkage between an accounts receivable system and a general ledger system). For each required software product, the following should be provided:
- a) Name;
- b) Mnemonic;
- c) Specification number;
- d) Version number;
- e) Source.

For each interface, the following should be provided:
- a) Discussion of the purpose of the interfacing software as related to this software product.
- b) Definition of the interface in terms of message content and format. It is not necessary to detail any well-documented interface, but a reference to the document defining the interface is required.
### 3.5.4  Communications interfaces
This should specify the various interfaces to communications such as local network protocols, etc.

## 3.6  Design constraints
Specify constraints on the system design imposed by external standards, regulatory requirements or project limitations.
### 3.6.1  Standards compliance
This subsection should specify the requirements derived from existing standards or regulations. They may include the following:
		
- a) Report format;
- b) Data naming;
- c) Accounting procedures;
- d) Audit tracing.
		

For example, this could specify the requirement for software to trace processing activity. Such traces are needed for some applications to meet minimum regulatory or financial standards. An audit trace requirement may, for example, state that all changes to a payroll database must be recorded in a trace file with before and after values.

## 3.7  Software system attributes
### 3.7.1  Reliability
This should specify the factors required to establish the required reliability of the software system at time of delivery.
### 3.7.2  Availability
This should specify the factors required to guarantee a defined availability level for the entire system such as checkpoint, recovery, and restart.

### 3.7.3  Security
This should specify the factors that protect the software from accidental or malicious access, use, modification, destruction, or disclosure. Specific requirements in this area could include the need to

- a) Utilize certain cryptographical techniques;
- b) Keep specific log or history data sets;
- c) Assign certain functions to different modules;
- d) Restrict communications between some areas of the program;
- e) Check data integrity for critical variables.
### 3.7.4  Maintainability
This should specify attributes of software that relate to the ease of maintenance of the software itself. There may be some requirement for certain modularity, interfaces, complexity, etc. Requirements should not be placed here just because they are thought to be good design practices.

### 3.7.5  Portability
This should specify attributes of software that relate to the ease of porting the software to other host machines and/or operating systems. This may include the following:

- a) Percentage of components with host-dependent code;
- b) Percentage of code that is host dependent;
- c) Use of a proven portable language;
- d) Use of a particular compiler or language subset;
- e) Use of a particular operating system.
## 3.8  Supporting information
Additional supporting information to be considered includes:

- a) sample input/output formats, descriptions of cost analysis studies or results of user surveys;
- b) supporting or background information that can help the readers of the SRS;
- c) a description of the problems to be solved by the software; and
- d) special packaging instructions for the code and the media to meet security, export, initial loading or other requirements.

The SRS should explicitly state whether or not these information items are to be considered part of the requirements.
			
# 4  Verification
Provide the verification approaches and methods planned to qualify the software. The information items for verification are recommended to be given in a parallel manner with the information items in 	Section 3.
# 5  Appendices
## 5.1  Assumptions and dependencies
This subsection of the SRS should list each of the factors that affect the requirements stated in the SRS. These factors are not design constraints on the software but are, rather, any changes to them that can affect the requirements in the SRS. For example, an assumption may be that a specific operating system will be available on the hardware designated for the software product. If, in fact, the operating system is not available, the SRS would then have to change accordingly. 
## 5.2 Apportioning of requirements
Apportion the software requirements to software elements. For requirements that will require implementation over multiple software elements, or when allocation to a software element is initially undefined, this should be so stated. A cross-reference table by function and software element should be used to summarize the apportionments.

Identify requirements that may be delayed until future versions of the system (e.g., blocks and/or increments).
## 5.3  Acronyms and abbreviations
This subsection should provide the acronyms and abbreviations required to properly interpret the SRS. This information may be provided by reference to one or more appendixes in the SRS or by reference to other documents.
