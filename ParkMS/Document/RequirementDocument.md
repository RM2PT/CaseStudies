# 1   Introduction
## 1.1   Purpose
This subsection should

- a) Delineate the purpose of the SRS;
- b) Specify the intended audience for the SRS.
## 1.2   Scope
Name of software to be developed: ParkMS System

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
<b>SI1 - ParkMSSystem</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEParkMSSystem">ParkMSSystem</span></td>
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
	<td><ul><li><a href="#OPopenPark">openPark</a></li><li><a href="#OPclosePark">closePark</a></li></ul></td>
	</tr>
<tr>
			<td><b>Temporary Variable</b></td>
			<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name ="ParkMSSystemCurrentPark">CurrentPark</span></td>
		<td>CurrentPark is a object of <a href="#CLASSPark">Park</a></td>
					</tr>
	<tr>
		<td><span name ="ParkMSSystemCurrentParkRecord">CurrentParkRecord</span></td>
		<td>CurrentParkRecord is a object of <a href="#CLASSParkRecord">ParkRecord</a></td>
					</tr>
	<tr>
		<td><span name ="ParkMSSystemCurrentMember">CurrentMember</span></td>
		<td>CurrentMember is a object of <a href="#CLASSMember">Member</a></td>
					</tr>
	<tr>
		<td><span name ="ParkMSSystemCurrentPayment">CurrentPayment</span></td>
		<td>the type of CurrentPayment is Real</td>
					</tr>
	</table>

<b>SI2 - ThirdPartyServices</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEThirdPartyServices">ThirdPartyServices</span></td>
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
	<td><ul></ul></td>
	</tr>
	</table>

<b>SI3 - SetPriceService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICESetPriceService">SetPriceService</span></td>
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
	<td><ul><li><a href="#OPsetSmallPrice">setSmallPrice</a></li><li><a href="#OPsetLargePrice">setLargePrice</a></li><li><a href="#OPsetMotoPrice">setMotoPrice</a></li></ul></td>
	</tr>
	</table>

<b>SI4 - GetHistoryService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEGetHistoryService">GetHistoryService</span></td>
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
	<td><ul><li><a href="#OPgetHistoryByPlateNumber">getHistoryByPlateNumber</a></li><li><a href="#OPgetHistoryByEntryTime">getHistoryByEntryTime</a></li><li><a href="#OPgetHistoryByOutTime">getHistoryByOutTime</a></li><li><a href="#OPgetHistoryByMember">getHistoryByMember</a></li></ul></td>
	</tr>
	</table>

<b>SI5 - AutomaticEntryService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEAutomaticEntryService">AutomaticEntryService</span></td>
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
	<td><ul><li><a href="#OPautomaticEntry">automaticEntry</a></li></ul></td>
	</tr>
<tr>
			<td><b>Temporary Variable</b></td>
			<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name ="AutomaticEntryServiceRecordID">RecordID</span></td>
		<td>the type of RecordID is Integer</td>
					</tr>
	</table>

<b>SI6 - ManuallyAllowOutService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManuallyAllowOutService">ManuallyAllowOutService</span></td>
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
	<td><ul><li><a href="#OPmanuallyAllowOut">manuallyAllowOut</a></li></ul></td>
	</tr>
	</table>

<b>SI7 - ManuallyAllowEntryService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManuallyAllowEntryService">ManuallyAllowEntryService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI7</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPmanuallyAllowEntry">manuallyAllowEntry</a></li></ul></td>
	</tr>
	</table>

<b>SI8 - AutomaticOutService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEAutomaticOutService">AutomaticOutService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI8</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPscanPlateNumber">scanPlateNumber</a></li><li><a href="#OPonlinePay">onlinePay</a></li></ul></td>
	</tr>
	</table>

<b>SI9 - RegisterService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICERegisterService">RegisterService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI9</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPregisterMember">registerMember</a></li><li><a href="#OPregisterVehicle">registerVehicle</a></li></ul></td>
	</tr>
	</table>

<b>SI10 - RechargeService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICERechargeService">RechargeService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI10</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPrecharge">recharge</a></li></ul></td>
	</tr>
	</table>

<b>SI11 - ManageParkCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManageParkCRUDService">ManageParkCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI11</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPcreatePark">createPark</a></li><li><a href="#OPqueryPark">queryPark</a></li><li><a href="#OPmodifyPark">modifyPark</a></li><li><a href="#OPdeletePark">deletePark</a></li></ul></td>
	</tr>
	</table>

<b>SI12 - ManageVehicleCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name ="SERVICEManageVehicleCRUDService">ManageVehicleCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Service ID:</b></td>
		<td>SI12</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
	<td><ul><li><a href="#OPcreateVehicle">createVehicle</a></li><li><a href="#OPqueryVehicle">queryVehicle</a></li><li><a href="#OPmodifyVehicle">modifyVehicle</a></li><li><a href="#OPdeleteVehicle">deleteVehicle</a></li></ul></td>
	</tr>
	</table>
​	 

### 1.3.2  Product functions
<b>Use Case Diagram</b>

![img](RequirementDocument.assets/54bc28f04c7d8a72c529196119fc1029)

<table>
	<tr>
		<td><b>ID</b></td>
		<td><b>Use Case Name</b></td>
		<td><b>Use Case Description</b></td>
		<td><b>Subfunction</b></td>
	</tr>
	<tr>
		<td>UC1</td>
		<td><a href="#UCmanuallyAllowOut">manuallyAllowOut</a></td>
		<td></td>
		<td>
		<p><a href="#OPmanuallyAllowOut">manuallyAllowOut</a></p>
		</td>
	</tr>
	<tr>
		<td>UC2</td>
		<td><a href="#UCmanuallyAllowEntry">manuallyAllowEntry</a></td>
		<td></td>
		<td>
		<p><a href="#OPmanuallyAllowEntry">manuallyAllowEntry</a></p>
		</td>
	</tr>
	<tr>
		<td>UC3</td>
		<td><a href="#UCautomaticEntry">automaticEntry</a></td>
		<td></td>
		<td>
		<p><a href="#OPautomaticEntry">automaticEntry</a></p>
		</td>
	</tr>
	<tr>
		<td>UC4</td>
		<td><a href="#UCautomaticOut">automaticOut</a></td>
		<td></td>
		<td>
		<p><a href="#OPscanPlateNumber">scanPlateNumber</a></p><p><a href="#OPonlinePay">onlinePay</a></p>
		</td>
	</tr>
	<tr>
		<td>UC5</td>
		<td><a href="#UCsetPrice">setPrice</a></td>
		<td></td>
		<td>
		<p><a href="#OPsetSmallPrice">setSmallPrice</a></p><p><a href="#OPsetLargePrice">setLargePrice</a></p><p><a href="#OPsetMotoPrice">setMotoPrice</a></p>
		</td>
	</tr>
	<tr>
		<td>UC6</td>
		<td><a href="#UCgetHistory">getHistory</a></td>
		<td></td>
		<td>
		<p><a href="#OPgetHistoryByPlateNumber">getHistoryByPlateNumber</a></p><p><a href="#OPgetHistoryByEntryTime">getHistoryByEntryTime</a></p><p><a href="#OPgetHistoryByOutTime">getHistoryByOutTime</a></p><p><a href="#OPgetHistoryByMember">getHistoryByMember</a></p>
		</td>
	</tr>
	<tr>
		<td>UC7</td>
		<td><a href="#UCregister">register</a></td>
		<td></td>
		<td>
		<p><a href="#OPregisterMember">registerMember</a></p><p><a href="#OPregisterVehicle">registerVehicle</a></p>
		</td>
	</tr>
	<tr>
		<td>UC8</td>
		<td><a href="#UCrecharge">recharge</a></td>
		<td></td>
		<td>
		<p><a href="#OPrecharge">recharge</a></p>
		</td>
	</tr>
	<tr>
		<td>UC9</td>
		<td><a href="#UCopenPark">openPark</a></td>
		<td></td>
		<td>
		</td>
	</tr>
	<tr>
		<td>UC10</td>
		<td><a href="#UCclosePark">closePark</a></td>
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
		<td><span name ="ACTORDriver">Driver</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A2</td>
		<td><span name ="ACTORSystemManager">SystemManager</span></td>
		<td></td>
		<td></td>
	</tr><tr>
		<td>A3</td>
		<td><span name ="ACTORParkManager">ParkManager</span></td>
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
<b>UC1 - manuallyAllowOut</b>

<p>System Sequence Diagram:</p>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanuallyAllowOut">manuallyAllowOut</span></td>
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
	<td><a href="#ACTORParkManager">ParkManager</a></td>
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
<b>UC2 - manuallyAllowEntry</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCmanuallyAllowEntry">manuallyAllowEntry</span></td>
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
	<td><a href="#ACTORParkManager">ParkManager</a></td>
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
<b>UC3 - automaticEntry</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCautomaticEntry">automaticEntry</span></td>
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
	<td><a href="#ACTORDriver">Driver</a></td>
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

<b>UC4 - automaticOut</b>
<p>System Sequence Diagram:</p>

![AutomaticOutSSD](Images/AutomaticOutSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCautomaticOut">automaticOut</span></td>
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
	<td><a href="#ACTORDriver">Driver</a></td>
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
	<td><p>1. Driver clicks to execute the operation <a href="#OPscanPlateNumber">scanPlateNumber</a>, with entering plateNumber, time</p><p>2. Driver clicks to execute the operation <a href="#OPonlinePay">onlinePay</a>, with entering memberID</p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>
<b>UC5 - setPrice</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCsetPrice">setPrice</span></td>
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
	<td><a href="#ACTORSystemManager">SystemManager</a></td>
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
<b>UC6 - getHistory</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCgetHistory">getHistory</span></td>
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
	<td><a href="#ACTORSystemManager">SystemManager</a></td>
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

<b>UC7 - register</b>
<p>System Sequence Diagram:</p>

![RegisterSSD](Images/RegisterSSD.svg)

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCregister">register</span></td>
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
	<td><a href="#ACTORDriver">Driver</a></td>
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
	<td><p>1. Driver clicks to execute the operation <a href="#OPregisterMember">registerMember</a>, with entering memberID, name</p><p>2. Driver clicks to execute the operation <a href="#OPregisterVehicle">registerVehicle</a>, with entering vehicleID, plateNumber, type</p></td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td></td>
	</tr>
	</table>
<b>UC8 - recharge</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCrecharge">recharge</span></td>
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
	<td><a href="#ACTORDriver">Driver</a></td>
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

<b>UC9 - openPark</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCopenPark">openPark</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC9</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORParkManager">ParkManager</a></td>
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

<b>UC10 - closePark</b>

<p>Use Case Description:</p>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name ="UCclosePark">closePark</span></td>
	</tr>
	<tr>
		<td><b>UseCase ID:</b></td>
		<td>UC10</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
	<td><a href="#ACTORParkManager">ParkManager</a></td>
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
<b>OP1 - createPark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreatePark">createPark</span></td>
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
		<td><a href="#SERVICEManageParkCRUDService">ManageParkCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>name</i>, type: String</p><p>3. name: <i>location</i>, type: String</p><p>4. name: <i>smallprice</i>, type: Real</p><p>5. name: <i>largeprice</i>, type: Real</p><p>6. name: <i>motoprice</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>par</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>par</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>par</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>par</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>par</i> represented the object of class <a href="#CLASSPark">Park</a></p><p>2. The object <i>par</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>par</i> became <i>id</i></p><p>4. The attribute <i>Name</i> of the object <i>par</i> became <i>name</i></p><p>5. The attribute <i>Location</i> of the object <i>par</i> became <i>location</i></p><p>6. The attribute <i>SmallPrice</i> of the object <i>par</i> became <i>smallprice</i></p><p>7. The attribute <i>LargePrice</i> of the object <i>par</i> became <i>largeprice</i></p><p>8. The attribute <i>MotoPrice</i> of the object <i>par</i> became <i>motoprice</i></p><p>9. The object <i>par</i> was put into the instance set of class <a href="#CLASSPark">Park</a></p><p>10. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createPark</b>:</p>

```java
Contract  ManageParkCRUDService::createPark(id : Integer, name : String, location : String, smallprice : Real, largeprice : Real, motoprice : Real) : Boolean {
		/* definition: find specific Park instance by id */
		definition:
			park:Park = Park.allInstance()->any(par:Park | par.Id = id)
		/* precondition: the instance park was not found in the system */
		precondition:
			park.oclIsUndefined() = true
		/* postcondition: 
		 * A Park instance par was created.
		 * all properties of par became the same values as inputs.
		 */
		postcondition:
			let par:Park in
			par.oclIsNew() and
			par.Id = id and
			par.Name = name and
			par.Location = location and
			par.SmallPrice = smallprice and
			par.LargePrice = largeprice and
			par.MotoPrice = motoprice and
			Park.allInstance()->includes(par) and
			result = true
}
```

<b>OP2 - queryPark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPqueryPark">queryPark</span></td>
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
		<td><a href="#SERVICEManageParkCRUDService">ManageParkCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td><a href="#CLASSPark">Park</a></td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>par</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>par</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>par</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>par</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was <i>park</i></p></td>
	</tr>
</table>

<p>Contract of <b>queryPark</b>:</p>

```java
Contract  ManageParkCRUDService::queryPark(id : Integer) : Park {
		/* definition: find specific Park instance by id */
		definition:
			park:Park = Park.allInstance()->any(par:Park | par.Id = id)
		/* precondition: the instance park was found in the system */
		precondition:
			park.oclIsUndefined() = false
		/* postcondition: return found the instance park */
		postcondition:
			result = park
}
```

<b>OP3 - modifyPark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPmodifyPark">modifyPark</span></td>
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
		<td><a href="#SERVICEManageParkCRUDService">ManageParkCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>name</i>, type: String</p><p>3. name: <i>location</i>, type: String</p><p>4. name: <i>smallprice</i>, type: Real</p><p>5. name: <i>largeprice</i>, type: Real</p><p>6. name: <i>motoprice</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>par</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>par</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>par</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>par</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Id</i> of the object <i>park</i> became <i>id</i></p><p>2. The attribute <i>Name</i> of the object <i>park</i> became <i>name</i></p><p>3. The attribute <i>Location</i> of the object <i>park</i> became <i>location</i></p><p>4. The attribute <i>SmallPrice</i> of the object <i>park</i> became <i>smallprice</i></p><p>5. The attribute <i>LargePrice</i> of the object <i>park</i> became <i>largeprice</i></p><p>6. The attribute <i>MotoPrice</i> of the object <i>park</i> became <i>motoprice</i></p><p>7. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>modifyPark</b>:</p>

```java
Contract  ManageParkCRUDService::modifyPark(id : Integer, name : String, location : String, smallprice : Real, largeprice : Real, motoprice : Real) : Boolean {
		/* definition: find specific Park instance by id */
		definition:
			park:Park = Park.allInstance()->any(par:Park | par.Id = id)
		/* precondition: the instance park was found in the system */
		precondition:
			park.oclIsUndefined() = false
		/* postcondition: all properties of par became the same values as inputs. */
		postcondition:
			park.Id = id and
			park.Name = name and
			park.Location = location and
			park.SmallPrice = smallprice and
			park.LargePrice = largeprice and
			park.MotoPrice = motoprice and
			result = true
}
```

<b>OP4 - deletePark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPdeletePark">deletePark</span></td>
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
		<td><a href="#SERVICEManageParkCRUDService">ManageParkCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>par</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>par</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>par</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>par</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>park</i> exists</p><p>2. The object <i>park</i> is in the instance set of class <a href="#CLASSPark">Park</a></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The object <i>park</i> was deleted from the instance set of class <a href="#CLASSPark">Park</a></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>deletePark</b>:</p>

```java
Contract  ManageParkCRUDService::deletePark(id : Integer) : Boolean {
		/* definition: find specific Park instance by id */
		definition:
			park:Park = Park.allInstance()->any(par:Park | par.Id = id)
		/* precondition: the instance park was found in the system */
		precondition:
			park.oclIsUndefined() = false and
			Park.allInstance()->includes(park)
		/* postcondition: the instance park was deleted from the system */
		postcondition:
			Park.allInstance()->excludes(park) and
			result = true
}
```

<b>OP5 - createVehicle</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPcreateVehicle">createVehicle</span></td>
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
		<td><a href="#SERVICEManageVehicleCRUDService">ManageVehicleCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>platenumber</i>, type: String</p><p>3. name: <i>type</i>, type: [SMALL|LARGE|MOTOCYCLE|SPECIAL]</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>veh</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>veh</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>veh</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>veh</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>vehicle</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>veh</i> represented the object of class <a href="#CLASSVehicle">Vehicle</a></p><p>2. The object <i>veh</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>veh</i> became <i>id</i></p><p>4. The attribute <i>PlateNumber</i> of the object <i>veh</i> became <i>platenumber</i></p><p>5. The attribute <i>Type</i> of the object <i>veh</i> became <i>type</i></p><p>6. The object <i>veh</i> was put into the instance set of class <a href="#CLASSVehicle">Vehicle</a></p><p>7. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>createVehicle</b>:</p>

```java
Contract  ManageVehicleCRUDService::createVehicle(id : Integer, platenumber : String, type : VehicleType[SMALL|LARGE|MOTOCYCLE|SPECIAL]) : Boolean {
		/* definition: find specific Vehicle instance by id */
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(veh:Vehicle | veh.Id = id)
		/* precondition: the instance vehicle was not found in the system */
		precondition:
			vehicle.oclIsUndefined() = true
		/* postcondition: 
		 * A Vehicle instance veh was created.
		 * all properties of veh became the same values as inputs.
		 */
		postcondition:
			let veh:Vehicle in
			veh.oclIsNew() and
			veh.Id = id and
			veh.PlateNumber = platenumber and
			veh.Type = type and
			Vehicle.allInstance()->includes(veh) and
			result = true
}
```

<b>OP6 - queryVehicle</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPqueryVehicle">queryVehicle</span></td>
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
		<td><a href="#SERVICEManageVehicleCRUDService">ManageVehicleCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td><a href="#CLASSVehicle">Vehicle</a></td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>veh</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>veh</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>veh</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>veh</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>vehicle</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was <i>vehicle</i></p></td>
	</tr>
</table>

<p>Contract of <b>queryVehicle</b>:</p>

```java
Contract  ManageVehicleCRUDService::queryVehicle(id : Integer) : Vehicle {
		/* definition: find specific Vehicle instance by id */
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(veh:Vehicle | veh.Id = id)
		/* precondition: the instance vehicle was found in the system */
		precondition:
			vehicle.oclIsUndefined() = false
		/* postcondition: return found the instance vehicle */
		postcondition:
			result = vehicle
}
```

<b>OP7 - modifyVehicle</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPmodifyVehicle">modifyVehicle</span></td>
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
		<td><a href="#SERVICEManageVehicleCRUDService">ManageVehicleCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>id</i>, type: Integer</p><p>2. name: <i>platenumber</i>, type: String</p><p>3. name: <i>type</i>, type: [SMALL|LARGE|MOTOCYCLE|SPECIAL]</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>veh</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>veh</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>veh</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>veh</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>vehicle</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Id</i> of the object <i>vehicle</i> became <i>id</i></p><p>2. The attribute <i>PlateNumber</i> of the object <i>vehicle</i> became <i>platenumber</i></p><p>3. The attribute <i>Type</i> of the object <i>vehicle</i> became <i>type</i></p><p>4. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>modifyVehicle</b>:</p>

```java
Contract  ManageVehicleCRUDService::modifyVehicle(id : Integer, platenumber : String, type : VehicleType[SMALL|LARGE|MOTOCYCLE|SPECIAL]) : Boolean {
		/* definition: find specific Vehicle instance by id */
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(veh:Vehicle | veh.Id = id)
		/* precondition: the instance vehicle was found in the system */
		precondition:
			vehicle.oclIsUndefined() = false
		/* postcondition: all properties of veh became the same values as inputs. */
		postcondition:
			vehicle.Id = id and
			vehicle.PlateNumber = platenumber and
			vehicle.Type = type and
			result = true
}
```

<b>OP8 - deleteVehicle</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPdeleteVehicle">deleteVehicle</span></td>
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
		<td><a href="#SERVICEManageVehicleCRUDService">ManageVehicleCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>id</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>veh</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>veh</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>veh</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>veh</i> is equal to <i>id</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>vehicle</i> exists</p><p>2. The object <i>vehicle</i> is in the instance set of class <a href="#CLASSVehicle">Vehicle</a></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The object <i>vehicle</i> was deleted from the instance set of class <a href="#CLASSVehicle">Vehicle</a></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>deleteVehicle</b>:</p>

```java
Contract  ManageVehicleCRUDService::deleteVehicle(id : Integer) : Boolean {
		/* definition: find specific Vehicle instance by id */
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(veh:Vehicle | veh.Id = id)
		/* precondition: the instance vehicle was found in the system */
		precondition:
			vehicle.oclIsUndefined() = false and
			Vehicle.allInstance()->includes(vehicle)
		/* postcondition: the instance vehicle was deleted from the system */
		postcondition:
			Vehicle.allInstance()->excludes(vehicle) and
			result = true
}
```

<b>OP9 - automaticEntry</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPautomaticEntry">automaticEntry</span></td>
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
		<td><a href="#SERVICEAutomaticEntryService">AutomaticEntryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>plateNumber</i>, type: String</p><p>2. name: <i>time</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>isParking</i> is the object <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represents an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meets:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>r</i> is equal to <i>plateNumber</i></p><p>&emsp;&emsp;The attribute <i>IsParking</i> of the object <i>r</i> is equal to <b>true</b></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>CurrentPark</i> exists</p><p>2. The attribute <i>IsOpened</i> of the object <i>CurrentPark</i> is equal to <b>true</b></p><p>3. The object <i>isParking</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>parkRecord</i> represented the object of class <a href="#CLASSParkRecord">ParkRecord</a></p><p>2. The object <i>parkRecord</i> was created</p><p>3. The attribute <i>PlateNumber</i> of the object <i>parkRecord</i> became <i>plateNumber</i></p><p>4. The attribute <i>EntryTime</i> of the object <i>parkRecord</i> became <i>time</i></p><p>5. The attribute <i>IsParking</i> of the object <i>parkRecord</i> became <b>true</b></p><p>6. The attribute <i>Id</i> of the object <i>parkRecord</i> became the previous value of temporary variable <a href="#AutomaticEntryServiceRecordID">RecordID</a> plus <b>1</b></p><p>7. The value of temporary variable <a href="#AutomaticEntryServiceRecordID">RecordID</a> became the previous value of temporary variable <a href="#AutomaticEntryServiceRecordID">RecordID</a> plus <b>1</b></p><p>8. The object <i>parkRecord</i> was put into the instance set of class <a href="#CLASSParkRecord">ParkRecord</a></p><p>9. The object <i>CurrentPark</i> was linked to the object <i>parkRecord</i> by <i>OwningRecords</i></p><p>10. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>automaticEntry</b>:</p>

```java
Contract AutomaticEntryService::automaticEntry(plateNumber : String, time : Date) : Boolean {
		definition:
			isParking:ParkRecord = ParkRecord.allInstance()->any(r:ParkRecord|r.PlateNumber=plateNumber and r.IsParking=true)
		precondition:
			CurrentPark.oclIsUndefined() = false and
			CurrentPark.IsOpened = true and
			isParking.oclIsUndefined() = true
		postcondition:
			let parkRecord:ParkRecord in
			parkRecord.oclIsNew() and
			parkRecord.PlateNumber = plateNumber and
			parkRecord.EntryTime = time and
			parkRecord.IsParking = true and
			parkRecord.Id = self.RecordID@pre+1 and
			self.RecordID = self.RecordID@pre+1 and
			ParkRecord.allInstance()->includes(parkRecord) and
			CurrentPark.OwningRecords->includes(parkRecord) and
			result = true
}
```

<b>OP10 - scanPlateNumber</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPscanPlateNumber">scanPlateNumber</span></td>
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
		<td><a href="#SERVICEAutomaticOutService">AutomaticOutService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>plateNumber</i>, type: String</p><p>2. name: <i>time</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Real</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p>1. <i>parkRecord</i> is the object <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represents an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meets:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>r</i> is equal to <i>plateNumber</i></p><p>&emsp;&emsp;The attribute <i>IsParking</i> of the object <i>r</i> is equal to <b>true</b></p><p>2. <i>vehicle</i> is the object <i>v</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>v</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>v</i> meets:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>v</i> is equal to <i>plateNumber</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>parkRecord</i> exists</p><p>2. The attribute <i>IsParking</i> of the object <i>parkRecord</i> is equal to <b>true</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>IsParking</i> of the object <i>parkRecord</i> became <b>false</b></p><p>2. The attribute <i>Type</i> of the object <i>parkRecord</i> became the attribute <i>Type</i> of the object <i>vehicle</i></p><p>3. If the attribute <i>Type</i> of the object <i>vehicle</i> was equal to <b>SPECIAL</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;ERROR12</p><p>Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;If the attribute <i>Type</i> of the object <i>vehicle</i> was equal to <b>SMALL</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;ERROR12</p><p>&emsp;&emsp;Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;If the attribute <i>Type</i> of the object <i>vehicle</i> was equal to <b>LARGE</b>, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ERROR12</p><p>&emsp;&emsp;&emsp;&emsp;Otherwise, take the following as postcondition(s):</p><p>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;ERROR12</p><p>4. The return value was <i>CurrentPayment</i></p></td>
	</tr>
</table>

<p>Contract of <b>scanPlateNumber</b>:</p>

```java
Contract AutomaticOutService::scanPlateNumber(plateNumber : String, time : Date) : Real {
		definition:
			parkRecord:ParkRecord = ParkRecord.allInstance()->any(r:ParkRecord|r.PlateNumber=plateNumber and r.IsParking=true),
			vehicle:Vehicle = Vehicle.allInstance()->any(v:Vehicle|v.PlateNumber=plateNumber)
		precondition:
			parkRecord.oclIsUndefined() = false and
			parkRecord.IsParking = true
		postcondition:
			parkRecord.IsParking = false and
			parkRecord.Type = vehicle.Type and
			if
				vehicle.Type = VehicleType::SPECIAL
			then
				CurrentPayment = 0
			else
				if
					vehicle.Type = VehicleType::SMALL
				then
					// CurrentPayment = parkRecord.SmallPrice*(time.DayOfYear-parkRecordtime.DayOfYear)
					CurrentPayment = 1
				else
					if
						vehicle.Type = VehicleType::LARGE
					then
						CurrentPayment = 2
					else
						CurrentPayment = 3
					endif
				endif
			endif and
			result = CurrentPayment
}
```

<b>OP11 - onlinePay</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPonlinePay">onlinePay</span></td>
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
		<td><a href="#SERVICEAutomaticOutService">AutomaticOutService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>memberID</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>member</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMember">Member</a>. <i>m</i> represents an object of class <a href="#CLASSMember">Member</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>memberID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>member</i> exists</p><p>2. The attribute <i>Balance</i> of the object <i>member</i> is greater than or equal to <i>CurrentPayment</i></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Balance</i> of the object <i>member</i> became its previous value minus <i>CurrentPayment</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>onlinePay</b>:</p>

```java
Contract AutomaticOutService::onlinePay(memberID:Integer) : Boolean {
		definition:
			member:Member = Member.allInstance()->any(m:Member|m.Id=memberID)
		precondition:
			member.oclIsUndefined() = false and
			member.Balance >= CurrentPayment
		postcondition:
			member.Balance = member.Balance@pre-CurrentPayment and
			result = true
}
```

<b>OP12 - setSmallPrice</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPsetSmallPrice">setSmallPrice</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP12</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICESetPriceService">SetPriceService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>parkID</i>, type: Integer</p><p>2. name: <i>price</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>p</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>p</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>p</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>p</i> is equal to <i>parkID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>SmallPrice</i> of the object <i>park</i> became <i>price</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>setSmallPrice</b>:</p>

```java
Contract SetPriceService::setSmallPrice(parkID : Integer, price : Real) : Boolean {
		definition:
			park:Park = Park.allInstance()->any(p:Park|p.Id=parkID)
		precondition:
			park.oclIsUndefined() = false
		postcondition:
			park.SmallPrice = price and
			result = true
}
```

<b>OP13 - setLargePrice</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPsetLargePrice">setLargePrice</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP13</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICESetPriceService">SetPriceService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>parkID</i>, type: Integer</p><p>2. name: <i>price</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>p</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>p</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>p</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>p</i> is equal to <i>parkID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>LargePrice</i> of the object <i>park</i> became <i>price</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>setLargePrice</b>:</p>

```java
Contract SetPriceService::setLargePrice(parkID : Integer, price : Real) : Boolean {
		definition:
			park:Park = Park.allInstance()->any(p:Park|p.Id=parkID)
		precondition:
			park.oclIsUndefined() = false
		postcondition:
			park.LargePrice = price and
			result = true
}
```

<b>OP14 - setMotoPrice</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPsetMotoPrice">setMotoPrice</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP14</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICESetPriceService">SetPriceService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>parkID</i>, type: Integer</p><p>2. name: <i>price</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>p</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>p</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>p</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>p</i> is equal to <i>parkID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>park</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>MotoPrice</i> of the object <i>park</i> became <i>price</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>setMotoPrice</b>:</p>

```java
Contract SetPriceService::setMotoPrice(parkID : Integer, price : Real) : Boolean {
		definition:
			park:Park = Park.allInstance()->any(p:Park|p.Id=parkID)
		precondition:
			park.oclIsUndefined() = false
		postcondition:
			park.MotoPrice = price and
			result = true
}
```

<b>OP15 - getHistoryByMember</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPgetHistoryByMember">getHistoryByMember</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP15</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEGetHistoryService">GetHistoryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>memberID</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of ParkRecord</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>member</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMember">Member</a>. <i>m</i> represents an object of class <a href="#CLASSMember">Member</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>memberID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>member</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSParkRecord">ParkRecord</a>, including all <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represented an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meet:</p><p>&emsp;&emsp;At least one <i>v</i> existed in all objects which <i>member</i> was linked to by <i>OwningVehicles</i>. <i>v</i> represented an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>v</i> meet:</p><p>&emsp;&emsp;&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>v</i> was equal to the attribute <i>PlateNumber</i> of the object <i>r</i></p></td>
	</tr>
</table>

<p>Contract of <b>getHistoryByMember</b>:</p>

```java
Contract GetHistoryService::getHistoryByMember(memberID : Integer) : Set(ParkRecord) {
		definition:
			member:Member = Member.allInstance()->any(m:Member|m.Id=memberID)
		precondition:
			member.oclIsUndefined() = false
		postcondition:
			result = ParkRecord.allInstance()->select(r:ParkRecord|member.OwningVehicles->exists(v:Vehicle|v.PlateNumber=r.PlateNumber))
}
```

<b>OP16 - getHistoryByOutTime</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPgetHistoryByOutTime">getHistoryByOutTime</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP16</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEGetHistoryService">GetHistoryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>from</i>, type: LocalDate</p><p>2. name: <i>to</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of ParkRecord</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>None</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSParkRecord">ParkRecord</a>, including all <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represented an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meet:</p><p>&emsp;&emsp;The attribute <i>OutTime</i> of the object <i>r</i> was after <i>from</i></p><p>&emsp;&emsp;The attribute <i>OutTime</i> of the object <i>r</i> was before <i>to</i></p></td>
	</tr>
</table>

<p>Contract of <b>getHistoryByOutTime</b>:</p>

```java
Contract GetHistoryService::getHistoryByOutTime(from : Date, to : Date) : Set(ParkRecord) {
		precondition:
			true
		postcondition:
			result = ParkRecord.allInstance()->select(r:ParkRecord|r.OutTime.isAfter(from) and r.OutTime.isBefore(to))
}
```

<b>OP17 - getHistoryByEntryTime</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPgetHistoryByEntryTime">getHistoryByEntryTime</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP17</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEGetHistoryService">GetHistoryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>from</i>, type: LocalDate</p><p>2. name: <i>to</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of ParkRecord</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>None</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSParkRecord">ParkRecord</a>, including all <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represented an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meet:</p><p>&emsp;&emsp;The attribute <i>EntryTime</i> of the object <i>r</i> was after <i>from</i></p><p>&emsp;&emsp;The attribute <i>EntryTime</i> of the object <i>r</i> was before <i>to</i></p></td>
	</tr>
</table>

<p>Contract of <b>getHistoryByEntryTime</b>:</p>

```java
Contract GetHistoryService::getHistoryByEntryTime(from : Date, to : Date) : Set(ParkRecord) {
		precondition:
			true
		postcondition:
			result = ParkRecord.allInstance()->select(r:ParkRecord|r.EntryTime.isAfter(from) and r.EntryTime.isBefore(to))
}
```

<b>OP18 - getHistoryByPlateNumber</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPgetHistoryByPlateNumber">getHistoryByPlateNumber</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP18</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEGetHistoryService">GetHistoryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>plateNumber</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Set of ParkRecord</td>
</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>None</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>The return value was the set of class <a href="#CLASSParkRecord">ParkRecord</a>, including all <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represented an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meet:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>r</i> was equal to <i>plateNumber</i></p></td>
	</tr>
</table>

<p>Contract of <b>getHistoryByPlateNumber</b>:</p>

```java
Contract GetHistoryService::getHistoryByPlateNumber(plateNumber : String) : Set(ParkRecord) {
		precondition:
			true
		postcondition:
			result = ParkRecord.allInstance()->select(r:ParkRecord|r.PlateNumber=plateNumber)
}
```

<b>OP19 - registerMember</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPregisterMember">registerMember</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP19</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICERegisterService">RegisterService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>memberID</i>, type: Integer</p><p>2. name: <i>name</i>, type: String</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>member</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMember">Member</a>. <i>m</i> represents an object of class <a href="#CLASSMember">Member</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>memberID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>member</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>newMember</i> represented the object of class <a href="#CLASSMember">Member</a></p><p>2. The object <i>newMember</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>newMember</i> became <i>memberID</i></p><p>4. The attribute <i>Name</i> of the object <i>newMember</i> became <i>name</i></p><p>5. The object <i>newMember</i> was put into the instance set of class <a href="#CLASSMember">Member</a></p><p>6. ERROR12</p><p>7. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>registerMember</b>:</p>

```java
Contract RegisterService::registerMember(memberID : Integer, name : String) : Boolean {
		definition:
			member:Member = Member.allInstance()->any(m:Member|m.Id=memberID)
		precondition:
			member.oclIsUndefined() = true
		postcondition:
			let newMember:Member in
			newMember.oclIsNew() and
			newMember.Id = memberID and
			newMember.Name = name and
			Member.allInstance()->includes(newMember) and
			CurrentMember = newMember and
			result = true
}
```

<b>OP20 - registerVehicle</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPregisterVehicle">registerVehicle</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP20</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICERegisterService">RegisterService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>vehicleID</i>, type: Integer</p><p>2. name: <i>plateNumber</i>, type: String</p><p>3. name: <i>type</i>, type: [SMALL|LARGE|MOTO|SPECIAL]</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>v</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>v</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>v</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>v</i> is equal to <i>vehicleID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>CurrentMember</i> exists</p><p>2. The object <i>vehicle</i> doesn't exist</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>newVehicle</i> represented the object of class <a href="#CLASSVehicle">Vehicle</a></p><p>2. The object <i>newVehicle</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>newVehicle</i> became <i>vehicleID</i></p><p>4. The attribute <i>PlateNumber</i> of the object <i>newVehicle</i> became <i>plateNumber</i></p><p>5. The attribute <i>Type</i> of the object <i>newVehicle</i> became <i>type</i></p><p>6. The object <i>newVehicle</i> was put into the instance set of class <a href="#CLASSVehicle">Vehicle</a></p><p>7. The object <i>CurrentMember</i> was linked to the object <i>newVehicle</i> by <i>OwningVehicles</i></p><p>8. The object <i>newVehicle</i> was linked to the object <i>CurrentMember</i> by <i>OwnedMember</i></p><p>9. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>registerVehicle</b>:</p>

```java
Contract RegisterService::registerVehicle(vehicleID : Integer, plateNumber : String, type:VehicleType[SMALL|LARGE|MOTO|SPECIAL]) : Boolean {
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(v:Vehicle|v.Id=vehicleID)
		precondition:
			CurrentMember.oclIsUndefined() = false and
			vehicle.oclIsUndefined() = true
		postcondition:
			let newVehicle:Vehicle in
			newVehicle.oclIsNew() and
			newVehicle.Id = vehicleID and
			newVehicle.PlateNumber = plateNumber and
			newVehicle.Type = type and
			Vehicle.allInstance()->includes(newVehicle) and
			CurrentMember.OwningVehicles->includes(newVehicle) and
			newVehicle.OwnedMember = CurrentMember and
			result = true
}
```

<b>OP21 - recharge</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPrecharge">recharge</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP21</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICERechargeService">RechargeService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>memberID</i>, type: Integer</p><p>2. name: <i>amount</i>, type: Real</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>member</i> is the object <i>m</i> in the instance set of class <a href="#CLASSMember">Member</a>. <i>m</i> represents an object of class <a href="#CLASSMember">Member</a>, and <i>m</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>m</i> is equal to <i>memberID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>The object <i>member</i> exists</p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>Balance</i> of the object <i>member</i> became its previous value plus <i>amount</i></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>recharge</b>:</p>

```java
Contract RechargeService::recharge(memberID : Integer, amount : Real) : Boolean {
		definition:
			member:Member = Member.allInstance()->any(m:Member|m.Id=memberID)
		precondition:
			member.oclIsUndefined() = false
		postcondition:
			member.Balance = member.Balance@pre+amount and
			result = true
}
```

<b>OP22 - manuallyAllowOut</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPmanuallyAllowOut">manuallyAllowOut</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP22</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEManuallyAllowOutService">ManuallyAllowOutService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>plateNumber</i>, type: String</p><p>2. name: <i>time</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>parkRecord</i> is the object <i>r</i> in the instance set of class <a href="#CLASSParkRecord">ParkRecord</a>. <i>r</i> represents an object of class <a href="#CLASSParkRecord">ParkRecord</a>, and <i>r</i> meets:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>r</i> is equal to <i>plateNumber</i></p><p>&emsp;&emsp;The attribute <i>IsParking</i> of the object <i>r</i> is equal to <b>true</b></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>parkRecord</i> exists</p><p>2. The attribute <i>IsParking</i> of the object <i>parkRecord</i> is equal to <b>true</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>IsParking</i> of the object <i>parkRecord</i> became <b>false</b></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>manuallyAllowOut</b>:</p>

```java
Contract ManuallyAllowOutService::manuallyAllowOut(plateNumber : String, time : Date) : Boolean {
		definition:
			parkRecord:ParkRecord = ParkRecord.allInstance()->any(r:ParkRecord|r.PlateNumber=plateNumber and r.IsParking=true)
		precondition:
			parkRecord.oclIsUndefined() = false and
			parkRecord.IsParking = true
		postcondition:
			parkRecord.IsParking = false and
			result = true
}
```

<b>OP23 - manuallyAllowEntry</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPmanuallyAllowEntry">manuallyAllowEntry</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP23</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEManuallyAllowEntryService">ManuallyAllowEntryService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>1. name: <i>plateNumber</i>, type: String</p><p>2. name: <i>type</i>, type: [SMALL|LARGE|MOTO|SPECIAL]</p><p>3. name: <i>time</i>, type: LocalDate</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>vehicle</i> is the object <i>v</i> in the instance set of class <a href="#CLASSVehicle">Vehicle</a>. <i>v</i> represents an object of class <a href="#CLASSVehicle">Vehicle</a>, and <i>v</i> meets:</p><p>&emsp;&emsp;The attribute <i>PlateNumber</i> of the object <i>v</i> is equal to <i>plateNumber</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>CurrentPark</i> exists</p><p>2. The attribute <i>IsOpened</i> of the object <i>CurrentPark</i> is equal to <b>true</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. <i>parkRecord</i> represented the object of class <a href="#CLASSParkRecord">ParkRecord</a></p><p>2. The object <i>parkRecord</i> was created</p><p>3. The attribute <i>Id</i> of the object <i>parkRecord</i> became the size of <i>CurrentPark</i> plus <b>1</b></p><p>4. The attribute <i>PlateNumber</i> of the object <i>parkRecord</i> became <i>plateNumber</i></p><p>5. The attribute <i>Type</i> of the object <i>parkRecord</i> became <i>type</i></p><p>6. The attribute <i>EntryTime</i> of the object <i>parkRecord</i> became <i>time</i></p><p>7. The attribute <i>IsParking</i> of the object <i>parkRecord</i> became <b>true</b></p><p>8. The object <i>parkRecord</i> was put into the instance set of class <a href="#CLASSParkRecord">ParkRecord</a></p><p>9. The object <i>CurrentPark</i> was linked to the object <i>parkRecord</i> by <i>OwningRecords</i></p><p>10. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>manuallyAllowEntry</b>:</p>

```java
Contract ManuallyAllowEntryService::manuallyAllowEntry(plateNumber : String, type : VehicleType[SMALL|LARGE|MOTO|SPECIAL], time : Date) : Boolean {
		definition:
			vehicle:Vehicle = Vehicle.allInstance()->any(v:Vehicle|v.PlateNumber=plateNumber)
		precondition:
			CurrentPark.oclIsUndefined() = false and
			CurrentPark.IsOpened = true
		postcondition:
			let parkRecord:ParkRecord in
			parkRecord.oclIsNew() and
			parkRecord.Id = CurrentPark.OwningRecords@pre.size()+1 and
			parkRecord.PlateNumber = plateNumber and
			parkRecord.Type = type and
			parkRecord.EntryTime = time and
			parkRecord.IsParking = true and
			ParkRecord.allInstance()->includes(parkRecord) and
			CurrentPark.OwningRecords->includes(parkRecord) and
			result = true
}
```

<b>OP24 - openPark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPopenPark">openPark</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP24</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEParkMSSystem">ParkMSSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>parkID</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>p</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>p</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>p</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>p</i> is equal to <i>parkID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>park</i> exists</p><p>2. The attribute <i>IsOpened</i> of the object <i>park</i> is equal to <b>false</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>IsOpened</i> of the object <i>park</i> became <b>true</b></p><p>2. ERROR12</p><p>3. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>openPark</b>:</p>

```java
Contract ParkMSSystem::openPark(parkID : Integer) : Boolean {
		definition:
			park:Park = Park.allInstance()->any(p:Park|p.Id=parkID)
		precondition:
			park.oclIsUndefined() = false and
			park.IsOpened = false
		postcondition:
			park.IsOpened = true and
			CurrentPark = park and
			result = true
}
```

<b>OP25 - closePark</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name ="OPclosePark">closePark</span></td>
	</tr>
	<tr>
		<td><b>Operation ID:</b></td>
		<td>OP25</td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td> </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a href="#SERVICEParkMSSystem">ParkMSSystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
<td><p>name: <i>parkID</i>, type: Integer</p></td>
</tr>
<tr>
	<td><b>Output Type:</b></td>
	<td>Boolean</td>
</tr>
<tr>
			<td><b>Definition:</b></td>
<td><p><i>park</i> is the object <i>p</i> in the instance set of class <a href="#CLASSPark">Park</a>. <i>p</i> represents an object of class <a href="#CLASSPark">Park</a>, and <i>p</i> meets:</p><p>&emsp;&emsp;The attribute <i>Id</i> of the object <i>p</i> is equal to <i>parkID</i></p></td>
	</tr>
	<tr>
<td><b>Preconditions:</b></td>
		<td><p>1. The object <i>park</i> exists</p><p>2. The attribute <i>IsOpened</i> of the object <i>park</i> is equal to <b>true</b></p></td>
</tr>
	<tr>
		<td><b>Postconditions:</b></td>
	<td><p>1. The attribute <i>IsOpened</i> of the object <i>park</i> became <b>false</b></p><p>2. The return value was <b>true</b></p></td>
	</tr>
</table>

<p>Contract of <b>closePark</b>:</p>

```java
Contract ParkMSSystem::closePark(parkID : Integer) : Boolean {
		definition:
			park:Park = Park.allInstance()->any(p:Park|p.Id=parkID)
		precondition:
			park.oclIsUndefined() = false and
			park.IsOpened = true
		postcondition:
			park.IsOpened = false and
			result = true
}
```


## 3.2  Database requirements
#### 3.2.1   Entity Analysis
<b>Conceptual Class Diagram</b> 

![Conceptual Class Diagram](Images/Conceptual_Class_Diagram.svg)

<b>E1 - ParkRecord</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSParkRecord">ParkRecord</span></td>
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
	<td>The Id of ParkRecord</td>
					</tr>
	<tr>
	    <td>PlateNumber</td>
	<td>String</td>
	<td>The PlateNumber of ParkRecord</td>
					</tr>
	<tr>
	    <td>Type</td>
	<td>[SMALL|LARGE|MOTOCYCLE|SPECIAL]</td>
	<td>The Type of ParkRecord</td>
					</tr>
	<tr>
	    <td>EntryTime</td>
	<td>LocalDate</td>
	<td>The EntryTime of ParkRecord</td>
					</tr>
	<tr>
	    <td>OutTime</td>
	<td>LocalDate</td>
	<td>The OutTime of ParkRecord</td>
					</tr>
	<tr>
	    <td>IsParking</td>
	<td>Boolean</td>
	<td>The IsParking of ParkRecord</td>
					</tr>
	<tr>
	    <td>TotalPayment</td>
	<td>Real</td>
	<td>The TotalPayment of ParkRecord</td>
					</tr>
	<tr>
	    <td>Description</td>
	<td>String</td>
	<td>The Description of ParkRecord</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>OwnedPark</td>
		<td><a href="#CLASSPark">Park</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>

<b>E2 - Park</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSPark">Park</span></td>
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
	<td>The Id of Park</td>
					</tr>
	<tr>
	    <td>Name</td>
	<td>String</td>
	<td>The Name of Park</td>
					</tr>
	<tr>
	    <td>Location</td>
	<td>String</td>
	<td>The Location of Park</td>
					</tr>
	<tr>
	    <td>SmallPrice</td>
	<td>Real</td>
	<td>The SmallPrice of Park</td>
					</tr>
	<tr>
	    <td>LargePrice</td>
	<td>Real</td>
	<td>The LargePrice of Park</td>
					</tr>
	<tr>
	    <td>MotoPrice</td>
	<td>Real</td>
	<td>The MotoPrice of Park</td>
					</tr>
	<tr>
	    <td>IsOpened</td>
	<td>Boolean</td>
	<td>The IsOpened of Park</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>OwningMembers</td>
		<td><a href="#CLASSMember">Member</a></td>
		<td>Association: One-to-Many</td>
	</tr>
	<tr>
		<td>OwningRecords</td>
		<td><a href="#CLASSParkRecord">ParkRecord</a></td>
		<td>Composition: One-to-Many</td>
	</tr>
	</table>

<b>E3 - Vehicle</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSVehicle">Vehicle</span></td>
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
	<td>The Id of Vehicle</td>
					</tr>
	<tr>
	    <td>PlateNumber</td>
	<td>String</td>
	<td>The PlateNumber of Vehicle</td>
					</tr>
	<tr>
	    <td>Type</td>
	<td>[SMALL|LARGE|MOTOCYCLE|SPECIAL]</td>
	<td>The Type of Vehicle</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>OwnedMember</td>
		<td><a href="#CLASSMember">Member</a></td>
		<td>Association: One-to-One</td>
	</tr>
	</table>

<b>E4 - Member</b>

<table>
	<tr>
		<td><b>Entity Name:</b></td>
		   <td colspan="2"><span name ="CLASSMember">Member</span></td>
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
	<td>The Id of Member</td>
					</tr>
	<tr>
	    <td>Name</td>
	<td>String</td>
	<td>The Name of Member</td>
					</tr>
	<tr>
	    <td>Balance</td>
	<td>Real</td>
	<td>The Balance of Member</td>
					</tr>
	<tr>
	    <td><b>Relationship Name</b></td>
	<td><b>Related Entity</b></td>
	<td><b>Relationship Type</b></td>
	</tr>
	<tr>
		<td>Parks</td>
		<td><a href="#CLASSPark">Park</a></td>
		<td>Aggregation: One-to-Many</td>
	</tr>
	<tr>
		<td>OwningVehicles</td>
		<td><a href="#CLASSVehicle">Vehicle</a></td>
		<td>Composition: One-to-Many</td>
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
