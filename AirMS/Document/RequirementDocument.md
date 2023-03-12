# 1   Introduction
## 1.1   Purpose
This subsection should

- a) Delineate the purpose of the SRS;
- b) Specify the intended audience for the SRS.
## 1.2   Scope
Name of software to be developed: Airport System

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
<b>SI1 - AirportSystem</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEAirportSystem">AirportSystem</span></td>
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
	<td><ul><li><a href="#OPcreateStaff">createStaff</a></li><li><a href="#OPcreateDevice">createDevice</a></li></ul></td>
	</tr>
	</table>

<b>SI2 - RepairService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICERepairService">RepairService</span></td>
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
	<td><ul><li><a href="#OPapprove">approve</a></li><li><a href="#OPfinishRepair">finishRepair</a></li><li><a href="#OPfeedback">feedback</a></li></ul></td>
	</tr>
	</table>

<b>SI3 - ThirdPartyServices</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEThirdPartyServices">ThirdPartyServices</span></td>
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
	<td><ul></ul></td>
	</tr>
	</table>

<b>SI4 - RaiseRepairService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICERaiseRepairService">RaiseRepairService</span></td>
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
	<td><ul><li><a href="#OPsubmitRequest">submitRequest</a></li><li><a href="#OPmanagerApprove1">managerApprove1</a></li><li><a href="#OPmasterApprove">masterApprove</a></li><li><a href="#OPmanagerReject">managerReject</a></li><li><a href="#OPmanagerApprove2">managerApprove2</a></li><li><a href="#OPmasterReject">masterReject</a></li></ul></td>
	</tr>
	</table>
​	 

### 1.3.2  Product functions
<b>Use Case Diagram</b>

![image-20220611084737666](RequirementDocument.assets/image-20220611084737666.png)

<table>
	<tr>
		<td><b>ID</b></td>
		<td><b>Use Case Name</b></td>
		<td><b>Use Case Description</b></td>
		<td><b>Subfunction</b></td>
	</tr>
	<tr>
		<td>UC1</td>
		<td><a href="#UCmanageUser">manageUser</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC2</td>
		<td><a href="#UCmanageDevice">manageDevice</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC3</td>
		<td><a href="#UCassignTask">assignTask</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC4</td>
		<td><a href="#UCsubmitRepairResult">submitRepairResult</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC5</td>
		<td><a href="#UCseekHelp">seekHelp</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC6</td>
		<td><a href="#UCinquireRequest">inquireRequest</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC7</td>
		<td><a href="#UCscore">score</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC8</td>
		<td><a href="#UCraiseRepair">raiseRepair</a></td>
		<td></td>
		<td>
		<p><a href="#OPsubmitRequest">submitRequest</a></p><p><a href="#OPmanagerApprove1">managerApprove1</a></p><p><a href="#OPmasterApprove">masterApprove</a></p><p><a href="#OPmanagerReject">managerReject</a></p><p><a href="#OPmanagerApprove2">managerApprove2</a></p><p><a href="#OPmasterReject">masterReject</a></p>
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
		<td><span name ="ACTORGroundStaff">GroundStaff</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A2</td>
		<td><span name ="ACTORManager">Manager</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A3</td>
		<td><span name ="ACTORMaster">Master</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A4</td>
		<td><span name ="ACTORWorker">Worker</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A5</td>
		<td><span name ="ACTORAdmin">Admin</span></td>
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
<b>UC1 - manageUser</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanageUser">manageUser</span></td>
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
	<td><a href="#ACTORAdmin">Admin</a></td>
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

<b>UC2 - manageDevice</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanageDevice">manageDevice</span></td>
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
	<td><a href="#ACTORAdmin">Admin</a></td>
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

<b>UC3 - assignTask</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCassignTask">assignTask</span></td>
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
	<td><a href="#ACTORMaster">Master</a></td>
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

<b>UC4 - submitRepairResult</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCsubmitRepairResult">submitRepairResult</span></td>
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
	<td><a href="#ACTORWorker">Worker</a></td>
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

<b>UC5 - seekHelp</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCseekHelp">seekHelp</span></td>
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
	<td><a href="#ACTORWorker">Worker</a></td>
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

<b>UC6 - inquireRequest</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCinquireRequest">inquireRequest</span></td>
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
	<td><a href="#ACTORGroundStaff">GroundStaff</a></td>
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

<b>UC7 - score</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCscore">score</span></td>
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
	<td><a href="#ACTORGroundStaff">GroundStaff</a></td>
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

<b>UC8 - raiseRepair</b>
<p>System Sequence Diagram:</p>

![RaiseRepairSSD](Images/RaiseRepairSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCraiseRepair">raiseRepair</span></td>
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
	<td><a href="#ACTORGroundStaff">GroundStaff</a><a href="#ACTORManager">Manager</a><a href="#ACTORMaster">Master</a></td>
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
	<td><p>1. GroundStaff clicks to execute the operation <a href="#OPsubmitRequest">submitRequest</a></p><p>2.  Execute  combinedFragement1</p><p>&emsp;Select condition1:</p><p>&emsp;&emsp;Manager clicks to execute the operation <a href="#OPmanagerApprove1">managerApprove1</a></p><p>&emsp;&emsp;Master clicks to execute the operation <a href="#OPmasterApprove">masterApprove</a></p><p>3.  Execute  combinedFragement2</p><p>&emsp;Select condition2:</p><p>&emsp;&emsp;Manager clicks to execute the operation <a href="#OPmanagerReject">managerReject</a></p><p>4.  Execute  combinedFragement3</p><p>&emsp;Select condition3:</p><p>&emsp;&emsp;Manager clicks to execute the operation <a href="#OPmanagerApprove2">managerApprove2</a></p><p>&emsp;&emsp;Master clicks to execute the operation <a href="#OPmasterReject">masterReject</a></p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>


### 3.1.2   System Operation
<b>OP1 - createStaff</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreateStaff">createStaff</span></td>
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
		<td><a href="#SERVICEAirportSystem">AirportSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>name</i>, type: String</p><p>3. name: <i>pswd</i>, type: String</p><p>4. name: <i>phone</i>, type: String</p><p>5. name: <i>role</i>, type: Integer</p><p>6. name: <i>bossid</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>sta</i> is the object <i>u</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>u</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p><p>2. <i>bo</i> is the object <i>uu</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>uu</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>uu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uu</i> is equal to <i>bossid</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>sta</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>s</i> represented the object of class <a href="#CLASSStaff">Staff</a></p><p>2. The object <i>s</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>s</i> became <i>id</i></p><p>4. The attribute <i>Name</i> of the object <i>s</i> became <i>name</i></p><p>5. The attribute <i>Password</i> of the object <i>s</i> became <i>pswd</i></p><p>6. The attribute <i>Phone</i> of the object <i>s</i> became <i>phone</i></p><p>7. The attribute <i>Role</i> of the object <i>s</i> became <i>role</i></p><p>8. If the object <i>bo</i> existed, take the following as postcondition(s):</p><p>&emsp;&emsp;The object <i>s</i> was linked to the object <i>bo</i> by <i>Boss</i></p><p>9. The object <i>s</i> was put into the instance set of class <a href="#CLASSStaff">Staff</a></p><p>10. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createStaff</b>:</p>

```java
Contract AirportSystem::createStaff(id : Integer, name : String, pswd : String, phone : String, role : Integer, bossid : Integer) : Boolean {
		definition:
			sta:Staff = Staff.allInstance()->any(u:Staff | u.Id = id),
			bo:Staff = Staff.allInstance()->any(uu:Staff | uu.Id = bossid)
		precondition:
			sta.oclIsUndefined() = true
		postcondition:
			let s:Staff in
			s.oclIsNew() and
			s.Id = id and
			s.Name = name and
			s.Password = pswd and
			s.Phone = phone and
			s.Role = role and
			if
				bo.oclIsUndefined() = false
			then
				s.Boss = bo
			endif and
			Staff.allInstance()->includes(s) and
			result = true
}
```

<b>OP2 - createDevice</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreateDevice">createDevice</span></td>
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
		<td><a href="#SERVICEAirportSystem">AirportSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>name</i>, type: String</p><p>3. name: <i>location</i>, type: String</p><p>4. name: <i>contactsid</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>dev</i> is the object <i>u</i> in the instance set of class <a href="#CLASSDevice">Device</a>. <i>u</i> represents an object of class <a href="#CLASSDevice">Device</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p><p>2. <i>sta</i> is the object <i>uu</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>uu</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>uu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uu</i> is equal to <i>contactsid</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>dev</i> doesn't exist</p><p>2. The object <i>sta</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>d</i> represented the object of class <a href="#CLASSDevice">Device</a></p><p>2. The object <i>d</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>d</i> became <i>id</i></p><p>4. The attribute <i>Name</i> of the object <i>d</i> became <i>name</i></p><p>5. The attribute <i>Location</i> of the object <i>d</i> became <i>location</i></p><p>6. The object <i>d</i> was linked to the object <i>sta</i> by <i>Contacts</i></p><p>7. The object <i>dev</i> was put into the instance set of class <a href="#CLASSDevice">Device</a></p><p>8. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createDevice</b>:</p>

```java
Contract AirportSystem::createDevice(id : Integer, name : String, location : String, contactsid : Integer) : Boolean {
		definition:
			dev:Device = Device.allInstance()->any(u:Device | u.Id = id),
			sta:Staff = Staff.allInstance()->any(uu:Staff | uu.Id = contactsid)
		precondition:
			dev.oclIsUndefined() = true and
			sta.oclIsUndefined() = false
		postcondition:
			let d:Device in
			d.oclIsNew() and
			d.Id = id and
			d.Name = name and
			d.Location = location and
			d.Contacts = sta and
			Device.allInstance()->includes(dev) and
			result = true
}
```

<b>OP3 - approve</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPapprove">approve</span></td>
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
		<td><a href="#SERVICERepairService">RepairService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>sid</i>, type: Integer</p><p>2. name: <i>rid</i>, type: Integer</p><p>3. name: <i>reject</i>, type: Boolean</p><p>4. name: <i>suggestion</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td><a href="#CLASSApprovalHistory">ApprovalHistory</a></td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>rep</i> is the object <i>u</i> in the instance set of class <a href="#CLASSRepair">Repair</a>. <i>u</i> represents an object of class <a href="#CLASSRepair">Repair</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>rid</i></p><p>2. <i>sta</i> is the object <i>uu</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>uu</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>uu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uu</i> is equal to <i>sid</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>rep</i> exists</p><p>2. The object <i>sta</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>ah</i> represented the object of class <a href="#CLASSApprovalHistory">ApprovalHistory</a></p><p>2. The object <i>ah</i> was created</p><p>3. The attribute <i>Reject</i> of the object <i>ah</i> became <i>reject</i></p><p>4. The attribute <i>Suggestion</i> of the object <i>ah</i> became <i>suggestion</i></p><p>5. The object <i>ah</i> was put into the instance set of class <a href="#CLASSApprovalHistory">ApprovalHistory</a></p><p>6. The object <i>rep</i> was linked to the object <i>ah</i> by <i>History</i></p><p>7. If the <i>reject</i> was not equal to <b>false</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;If the attribute <i>Process</i> of the object <i>rep</i> was equal to <b>0</b>, and the attribute <i>Role</i> of the object <i>sta</i> was equal to <b>1</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;The attribute <i>Process</i> of the object <i>rep</i> became <b>1</b></p><p>&emsp;&emsp;Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;If the attribute <i>Process</i> of the object <i>rep</i> was equal to <b>1</b>, and the attribute <i>Role</i> of the object <i>sta</i> was equal to <b>2</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;The attribute <i>Process</i> of the object <i>rep</i> became <b>2</b></p><p>&emsp;&emsp;&emsp;&emsp;Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;If the attribute <i>Process</i> of the object <i>rep</i> was equal to <b>2</b>, and the attribute <i>Role</i> of the object <i>sta</i> was equal to <b>3</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;The attribute <i>Process</i> of the object <i>rep</i> became <b>3</b></p><p>Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;The attribute <i>Process</i> of the object <i>rep</i> became <b>5</b></p><p>8. The object <i>rep</i> was put into the instance set of class <a href="#CLASSRepair">Repair</a></p><p>9. The return value was <i>ah</i></p></td>
	</tr>
</table>

<p>Contract of <b>approve</b>:</p>

```java
Contract RepairService::approve(sid : Integer, rid : Integer, reject : Boolean, suggestion : String) : ApprovalHistory {
		definition:
			rep:Repair = Repair.allInstance()->any(u:Repair | u.Id = rid),
			sta:Staff = Staff.allInstance()->any(uu:Staff | uu.Id = sid)
		precondition:
			rep.oclIsUndefined() = false and
			sta.oclIsUndefined() = false
		postcondition:
			let ah:ApprovalHistory in
			ah.oclIsNew() and
			ah.Reject = reject and
			ah.Suggestion = suggestion and
			ApprovalHistory.allInstance()->includes(ah) and
			rep.History->includes(ah) and
			if
				reject <> false
			then
				if
					rep.Process = 0 and // STAFFREQUEST
					sta.Role = 1 // MASTER
				then
					rep.Process = 1 // MASTERAPPROVE
				else
					if
						rep.Process = 1 and // MASTERAPPROVE
						sta.Role = 2 // MANAGER
					then
						rep.Process = 2 // MANAGERAPPROVE
					else
						if
							rep.Process = 2 and // MANAGERAPPROVE
							sta.Role = 3 // WORKER
						then
							rep.Process = 3 // WORKERAPPROVE
						endif
					endif
				endif
			else
				rep.Process = 5 // REJECT
			endif and
			Repair.allInstance()->includes(rep) and
			result = ah
}
```

<b>OP4 - finishRepair</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPfinishRepair">finishRepair</span></td>
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
		<td><a href="#SERVICERepairService">RepairService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>sid</i>, type: Integer</p><p>3. name: <i>did</i>, type: Integer</p><p>4. name: <i>res</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>rep</i> is the object <i>u</i> in the instance set of class <a href="#CLASSRepair">Repair</a>. <i>u</i> represents an object of class <a href="#CLASSRepair">Repair</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p><p>2. <i>sta</i> is the object <i>uu</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>uu</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>uu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uu</i> is equal to <i>sid</i></p><p>3. <i>dev</i> is the object <i>uuu</i> in the instance set of class <a href="#CLASSDevice">Device</a>. <i>uuu</i> represents an object of class <a href="#CLASSDevice">Device</a>, and <i>uuu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uuu</i> is equal to <i>did</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>dev</i> is linked to the object <i>sta</i> by <i>Contacts</i></p><p>2. The attribute <i>Role</i> of the object <i>sta</i> is equal to <b>3</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Process</i> of the object <i>rep</i> became <b>7</b></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>finishRepair</b>:</p>

```java
Contract RepairService::finishRepair(id : Integer, sid : Integer, did : Integer, res : String) : Boolean {
		definition:
			rep:Repair = Repair.allInstance()->any(u:Repair | u.Id = id),
			sta:Staff = Staff.allInstance()->any(uu:Staff | uu.Id = sid),
			dev:Device = Device.allInstance()->any(uuu:Device | uuu.Id = did)
		precondition:
			dev.Contacts = sta and
			sta.Role = 3
		postcondition:
			rep.Process = 7 and // FINISH
			result = true
}
```

<b>OP5 - feedback</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPfeedback">feedback</span></td>
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
		<td><a href="#SERVICERepairService">RepairService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>sid</i>, type: Integer</p><p>3. name: <i>score</i>, type: Integer</p><p>4. name: <i>des</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>rep</i> is the object <i>u</i> in the instance set of class <a href="#CLASSRepair">Repair</a>. <i>u</i> represents an object of class <a href="#CLASSRepair">Repair</a>, and <i>u</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>u</i> is equal to <i>id</i></p><p>2. <i>sta</i> is the object <i>uu</i> in the instance set of class <a href="#CLASSStaff">Staff</a>. <i>uu</i> represents an object of class <a href="#CLASSStaff">Staff</a>, and <i>uu</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>uu</i> is equal to <i>sid</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>rep</i> is linked to the object <i>sta</i> by <i>RaiseStaff</i></p><p>2. The attribute <i>Role</i> of the object <i>sta</i> is equal to <b>0</b></p><p>3. The attribute <i>Process</i> of the object <i>rep</i> is equal to <b>7</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Score</i> of the object <i>rep</i> became <i>score</i></p><p>2. If the <i>score</i> was greater than or equal to <b>3</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;The attribute <i>Close</i> of the object <i>rep</i> became <b>true</b></p><p>Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;The attribute <i>Close</i> of the object <i>rep</i> became <b>false</b></p><p>&emsp;&emsp;The attribute <i>Description</i> of the object <i>rep</i> became <i>des</i></p><p>&emsp;&emsp;The attribute <i>Process</i> of the object <i>rep</i> became <b>0</b></p><p>3. The object <i>rep</i> was put into the instance set of class <a href="#CLASSRepair">Repair</a></p><p>4. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>feedback</b>:</p>

```java
Contract RepairService::feedback(id : Integer, sid : Integer, score : Integer, des : String) : Boolean {
		definition:
			rep:Repair = Repair.allInstance()->any(u:Repair | u.Id = id),
			sta:Staff = Staff.allInstance()->any(uu:Staff | uu.Id = sid)
		precondition:
			rep.RaiseStaff = sta and
			sta.Role = 0 and
			rep.Process = 7 // FINISH
		postcondition:
			rep.Score = score and
			if
				score >= 3
			then
				rep.Close = true
			else
				rep.Close = false and
				rep.Description = des and
				rep.Process = 0 // 重新进入维修列表
			endif and
			Repair.allInstance()->includes(rep) and
			result = true
}
```


## 3.2  Database requirements
#### 3.2.1   Entity Analysis
<b>Conceptual Class Diagram</b> 

![image-20220523103809671](RequirementDocument.assets/image-20220523103809671.png)

<b>E1 - Repair</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSRepair">Repair</span></td>
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
	<td>Integer</td>
	<td>The Id of Repair</td>
					</tr>
	<tr>
	    <td>Repairname</td>
	<td>String</td>
	<td>The Repairname of Repair</td>
					</tr>
	<tr>
	    <td>Price</td>
	<td>Integer</td>
	<td>The Price of Repair</td>
					</tr>
	<tr>
	    <td>Description</td>
	<td>String</td>
	<td>The Description of Repair</td>
					</tr>
	<tr>
	    <td>Score</td>
	<td>Integer</td>
	<td>The Score of Repair</td>
					</tr>
	<tr>
	    <td>FailTime</td>
	<td>LocalDate</td>
	<td>The FailTime of Repair</td>
					</tr>
	<tr>
	    <td>Close</td>
	<td>Boolean</td>
	<td>The Close of Repair</td>
					</tr>
	<tr>
	    <td>Process</td>
	<td>Integer</td>
	<td>The Process of Repair</td>
					</tr>
	<tr>
	    <td>Result</td>
	<td>String</td>
	<td>The Result of Repair</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>History</td>
		<td><a href="#CLASSApprovalHistory">ApprovalHistory</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	<tr>
		<td>RelatedDevice</td>
		<td><a href="#CLASSDevice">Device</a></td>
		<td>Association: One-to-One</td>
	</tr>
	<tr>
		<td>RaiseStaff</td>
		<td><a href="#CLASSStaff">Staff</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>

<b>E2 - Staff</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSStaff">Staff</span></td>
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
	<td>Integer</td>
	<td>The Id of Staff</td>
					</tr>
	<tr>
	    <td>Name</td>
	<td>String</td>
	<td>The Name of Staff</td>
					</tr>
	<tr>
	    <td>Password</td>
	<td>String</td>
	<td>The Password of Staff</td>
					</tr>
	<tr>
	    <td>Phone</td>
	<td>String</td>
	<td>The Phone of Staff</td>
					</tr>
	<tr>
	    <td>Role</td>
	<td>Integer</td>
	<td>The Role of Staff</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>Boss</td>
		<td><a href="#CLASSStaff">Staff</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>

<b>E3 - Device</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSDevice">Device</span></td>
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
	    <td>Id</td>
	<td>Integer</td>
	<td>The Id of Device</td>
					</tr>
	<tr>
	    <td>Name</td>
	<td>String</td>
	<td>The Name of Device</td>
					</tr>
	<tr>
	    <td>Location</td>
	<td>String</td>
	<td>The Location of Device</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>Contacts</td>
		<td><a href="#CLASSStaff">Staff</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>

<b>E4 - ApprovalHistory</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSApprovalHistory">ApprovalHistory</span></td>
	</tr>
	<tr>
		<td><b>Entity ID:</b></td>
		   <td colspan="2">E4</td>
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
	<td>Integer</td>
	<td>The Id of ApprovalHistory</td>
					</tr>
	<tr>
	    <td>StaffId</td>
	<td>Integer</td>
	<td>The StaffId of ApprovalHistory</td>
					</tr>
	<tr>
	    <td>Reject</td>
	<td>Boolean</td>
	<td>The Reject of ApprovalHistory</td>
					</tr>
	<tr>
	    <td>Suggestion</td>
	<td>String</td>
	<td>The Suggestion of ApprovalHistory</td>
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
