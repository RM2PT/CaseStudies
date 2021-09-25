<h1>1   Introduction</h1>
<h2>1.1   Purpose</h2>
This subsection should

- a) Delineate the purpose of the SRS;
- b) Specify the intended audience for the SRS.
<h2>1.2   Scope</h2>
Name of software to be developed: CoCoME System

This subsection should

- b) Explain what the software product(s) will, and, if necessary, will not do;
- c) Describe the application of the software being specifified, including relevant benefifits, objectives, and goals;
- d) Be consistent with similar statements in higher-level specififications (e.g., the system requirements specifification), if they exist.
<h2>1.3   Definitions, acronyms, and abbreviations</h2>
This subsection should provide the defifinitions of all terms, acronyms, and abbreviations required to properly interpret the SRS. This information may be provided by reference to one or more appendixes in the SRS or by reference to other documents.
<h2>1.4   References</h2>
This subsection should

- a) Provide a complete list of all documents referenced elsewhere in the SRS;
- b) Identify each document by title, report number (if applicable), date, and publishing organization;
- c) Specify the sources from which the references can be obtained.

This information may be provided by reference to an appendix or to another document.

<h2>1.5   Overview</h2>
This subsection should

- a) Describe what the rest of the SRS contains;
- b) Explain how the SRS is organized.
<h1>2  Overall description</h1>
<h2>2.1  Product perspective</h2>
This subsection of the SRS should put the product into perspective with other related products. If the product is independent and totally self-contained, it should be so stated here. If the SRS defines a product that is a component of a larger system, as frequently occurs, then this subsection should relate the requirements of that larger system to functionality of the software and should identify interfaces between that system and the software.
<h2>2.2  Product functions</h2>
Functions required by store cashier
- The cashier checks out items
- The cashier opens cash desk
- The cashier closes cash desk
Functions required by store manager
- The store manager places an order for purchase
- The store manager receives the order for purchase
- The store manager views the stock report
- The store manager changes the price of item
- The store manager views all suppliers
- The store manager opens the store
- The store manager closes the store
Functions required by CoCoMe system administrator
- The administrator manages store information, including entering, inquiring, modifying and deleting of store information
- The administrator manages catalogues of items, including entering, inquiring, modifying and deleting of catalogue information
- The administrator manages cash desk information, including entering, inquiring, modifying and deleting of cash desk information
- The administrator manages cashier information, including entering, inquiring, modifying and deleting of cashier information
- The administrator manages item information, including entering, inquiring, modifying and deleting of item information
- The administrator manages supplier information, including entering, inquiring, modifying and deleting of supplier information
<h2>2.3  User characteristics</h2>
The applicable objects of this system are store cashier, store manager, CoCoMe system administrator.
If they know the basic operation of computer, they can use the system to operate the required functions.
Maybe some users need some relevant training.
<h2>2.4  Constraints</h2>
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
<h2>2.5  Assumptions and dependencies</h2>
This subsection of the SRS should list each of the factors that affect the requirements stated in the SRS. These factors are not design constraints on the software but are, rather, any changes to them that can affect the requirements in the SRS. For example, an assumption may be that a specific operating system will be available on the hardware designated for the software product. If, in fact, the operating system is not available, the SRS would then have to change accordingly. 
<h2>2.6  Apportioning of requirements</h2>
This subsection of the SRS should identify requirements that may be delayed until future versions of the system.
<h1>3  Specific requirements</h1>
<h2>3.2  Functional requirements</h2>
<h3>3.1.1   User Requirements</h3>
<h4>3.1.1.1 Use Case Diagram</h4>

![Use Case Diagram](https://github.com/Tians996/CaseStudies/blob/master/CoCoMEwithDocument/Document/Use%20Case%20Diagram.jpg)

<h4>3.1.1.2 Requirements Description</h4>
<b>Cashier</b>
<table>
			<tr>
			       <td><b>Actor Name:</b></td>
			       <td colspan="5"><span name = "ActorCashier">Cashier</span></td>
			   </tr>
			<tr>
			       <td><b>Description:</b></td>
			       <td colspan="5">The cashier is responsible for opening or closing the cash desk and the checkout of items</td>
			   </tr>				   
			<tr>
				       <td colspan="5"><b>Required Functions</b></td>
				       <td><b>Related Use Case</b></td>
			 </tr>
<tr>
	<td colspan="5">The cashier checks out items</td>
	<td><a  href="#processSale">processSale</a></td>
</tr>
<tr>
	<td colspan="5">The cashier opens cash desk</td>
	<td><a  href="#openCashDesk">openCashDesk</a></td>
</tr>
<tr>
	<td colspan="5">The cashier closes cash desk</td>
	<td><a  href="#closeCashDesk">closeCashDesk</a></td>
</tr>
</table>
<b>StoreManager</b>
<table>
			<tr>
			       <td><b>Actor Name:</b></td>
			       <td colspan="5"><span name = "ActorStoreManager">StoreManager</span></td>
			   </tr>
			<tr>
			       <td><b>Description:</b></td>
			       <td colspan="5">The store manager is responsible for procurement and price setting of items,and opening or closing the store</td>
			   </tr>				   
			<tr>
				       <td colspan="5"><b>Required Functions</b></td>
				       <td><b>Related Use Case</b></td>
			 </tr>
<tr>
	<td colspan="5">The store manager places an order for purchase</td>
	<td><a  href="#orderProducts">orderProducts</a></td>
</tr>
<tr>
	<td colspan="5">The store manager receives the order for purchase</td>
	<td><a  href="#receiveOrderedProduct">receiveOrderedProduct</a></td>
</tr>
<tr>
	<td colspan="5">The store manager views the stock report</td>
	<td><a  href="#showStockReports">showStockReports</a></td>
</tr>
<tr>
	<td colspan="5">The store manager changes the price of item</td>
	<td><a  href="#changePrice">changePrice</a></td>
</tr>
<tr>
	<td colspan="5">The store manager views all suppliers</td>
	<td><a  href="#listSuppliers">listSuppliers</a></td>
</tr>
<tr>
	<td colspan="5">The store manager opens the store</td>
	<td><a  href="#openStore">openStore</a></td>
</tr>
<tr>
	<td colspan="5">The store manager closes the store</td>
	<td><a  href="#closeStore">closeStore</a></td>
</tr>
</table>
<b>Administrator</b>
<table>
			<tr>
			       <td><b>Actor Name:</b></td>
			       <td colspan="5"><span name = "ActorAdministrator">Administrator</span></td>
			   </tr>
			<tr>
			       <td><b>Description:</b></td>
			       <td colspan="5">The system administrator is responsible for managing information, including store information, cash desk information, cashier information, item information, item catalogue information and supplier information</td>
			   </tr>				   
			<tr>
				       <td colspan="5"><b>Required Functions</b></td>
				       <td><b>Related Use Case</b></td>
			 </tr>
<tr>
	<td colspan="5">The administrator manages store information, including entering, inquiring, modifying and deleting of store information</td>
	<td><a  href="#manageStore">manageStore</a></td>
</tr>
<tr>
	<td colspan="5">The administrator manages catalogues of items, including entering, inquiring, modifying and deleting of catalogue information</td>
	<td><a  href="#manageProductCatalog">manageProductCatalog</a></td>
</tr>
<tr>
	<td colspan="5">The administrator manages cash desk information, including entering, inquiring, modifying and deleting of cash desk information</td>
	<td><a  href="#manageCashDesk">manageCashDesk</a></td>
</tr>
<tr>
	<td colspan="5">The administrator manages cashier information, including entering, inquiring, modifying and deleting of cashier information</td>
	<td><a  href="#manageCashier">manageCashier</a></td>
</tr>
<tr>
	<td colspan="5">The administrator manages item information, including entering, inquiring, modifying and deleting of item information</td>
	<td><a  href="#manageItem">manageItem</a></td>
</tr>
<tr>
	<td colspan="5">The administrator manages supplier information, including entering, inquiring, modifying and deleting of supplier information</td>
	<td><a  href="#manageSupplier">manageSupplier</a></td>
</tr>
</table>

<h3>3.1.2   System Requirement</h3>
<h4>3.1.2.1 Use Case Description</h4>
<b>UC 1 - processSale</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "processSale">processSale</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 1</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The cashier checks out items</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorCashier">Cashier</a></td>
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
		<td>
		<p>1. Cashier clicks to execute the operation <a  href="#makeNewSale">makeNewSale</a></p>
		<p>2. Cashier clicks to execute the operation <a  href="#enterItem">enterItem</a>, with entering barcode, quantity</p>
		<p>&emsp;<i>If hasMoreItems, repeat the step(s) 2 </i></p>
		<p>3. Cashier clicks to execute the operation <a  href="#endSale">endSale</a></p>
		<p>4.  Execute  paymentMethodAlt</p>
		<p>&emsp;Select cash:</p>
		<p>&emsp;&emsp;Cashier clicks to execute the operation <a  href="#makeCashPayment">makeCashPayment</a>, with entering amount</p>
		<p>&emsp;Select card:</p>
		<p>&emsp;&emsp;Cashier clicks to execute the operation <a  href="#makeCardPayment">makeCardPayment</a>, with entering cardAccountNumber, expiryDate, fee</p>
		</td>
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>

![ProcessSaleSSD](https://github.com/Tians996/CaseStudies/blob/master/CoCoMEwithDocument/Document/ProcessSaleSSD.jpg)

<b>UC 2 - openCashDesk</b>

<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "openCashDesk">openCashDesk</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 2</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The cashier opens cash desk</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorCashier">Cashier</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 3 - closeCashDesk</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "closeCashDesk">closeCashDesk</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 3</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The cashier closes cash desk</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorCashier">Cashier</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 4 - orderProducts</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "orderProducts">orderProducts</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 4</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager places an order for purchase</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 5 - receiveOrderedProduct</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "receiveOrderedProduct">receiveOrderedProduct</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 5</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager receives the order for purchase</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 6 - showStockReports</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "showStockReports">showStockReports</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 6</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager views the stock report</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 7 - changePrice</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "changePrice">changePrice</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 7</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager changes the price of item</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 8 - listSuppliers</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "listSuppliers">listSuppliers</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 8</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager views all suppliers</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 9 - openStore</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "openStore">openStore</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 9</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager opens the store</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 10 - closeStore</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "closeStore">closeStore</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 10</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The store manager closes the store</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorStoreManager">StoreManager</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 11 - manageStore</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageStore">manageStore</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 11</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages store information, including entering, inquiring, modifying and deleting of store information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 12 - manageProductCatalog</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageProductCatalog">manageProductCatalog</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 12</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages catalogues of items, including entering, inquiring, modifying and deleting of catalogue information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 13 - manageCashDesk</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageCashDesk">manageCashDesk</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 13</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages cash desk information, including entering, inquiring, modifying and deleting of cash desk information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 14 - manageCashier</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageCashier">manageCashier</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 14</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages cashier information, including entering, inquiring, modifying and deleting of cashier information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 15 - manageItem</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageItem">manageItem</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 15</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages item information, including entering, inquiring, modifying and deleting of item information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<b>UC 16 - manageSupplier</b>
<table>
	<tr>
		<td><b>UseCase Name:</b></td>
		<td><span name = "manageSupplier">manageSupplier</span></td>
	</tr>
	<tr>
		<td><b>UC ID:</b></td>
		<td>UC 16</td>
	</tr>
	<tr>
		<td><b>Brief Description:</b></td>
		<td>The administrator manages supplier information, including entering, inquiring, modifying and deleting of supplier information</td>
	</tr>
	<tr>
		<td><b>Involved Actor:</b></td>
		<td><a  href="#ActorAdministrator">Administrator</a></td>
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
	</tr>
	<tr>
		<td><b>Alternative Path:</b></td>
		<td><ol></ol></td>
	</tr>
</table>
<h4>3.1.2.2   Entity analysis</h4>
<b>Conceptual Class Diagram</b> 

![Conceptual Class Diagram](https://github.com/Tians996/CaseStudies/blob/master/CoCoMEwithDocument/Document/Conceptual%20Class%20Diagram.jpg)

<b>Store</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Store">Store</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The place where items are sold</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of Store</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of Store</td>
	  </tr>
<tr>
       <td>Address</td>
	<td>String</td>
	<td colspan="2">The Address of Store</td>
	  </tr>
<tr>
       <td>IsOpened</td>
	<td>Boolean</td>
	<td colspan="2">The IsOpened of Store</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>AssociationCashdeskes</td>
			 		<td><a  href="#CashDesk">CashDesk</a></td>
			 		<td>Association</td>
			 		<td>One Store is linked with many CashDesk</td>
			 		 </tr>
 <tr>
     <td>Productcatalogs</td>
			 		<td><a  href="#ProductCatalog">ProductCatalog</a></td>
			 		<td>Association</td>
			 		<td>One Store is linked to many ProductCatalog</td>
			 		 </tr>
 <tr>
     <td>Items</td>
			 		<td><a  href="#Item">Item</a></td>
			 		<td>Association</td>
			 		<td>One Store is linked to many Item</td>
			 		 </tr>
 <tr>
     <td>Cashiers</td>
			 		<td><a  href="#Cashier">Cashier</a></td>
			 		<td>Association</td>
			 		<td>One Store is linked with many Cashier</td>
			 		 </tr>
 <tr>
     <td>Sales</td>
			 		<td><a  href="#Sale">Sale</a></td>
			 		<td>Association</td>
			 		<td>One Store is linked with many Sale</td>
			 		 </tr>
</table>
<b>ProductCatalog</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "ProductCatalog">ProductCatalog</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The catalogue of items</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of ProductCatalog</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of ProductCatalog</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>ContainedItems</td>
			 		<td><a  href="#Item">Item</a></td>
			 		<td>Association</td>
			 		<td>One ProductCatalog is linked with many Item</td>
			 		 </tr>
</table>
<b>CashDesk</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "CashDesk">CashDesk</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The cash desk in store</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of CashDesk</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of CashDesk</td>
	  </tr>
<tr>
       <td>IsOpened</td>
	<td>Boolean</td>
	<td colspan="2">The IsOpened of CashDesk</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>ContainedSales</td>
			 		<td><a  href="#Sale">Sale</a></td>
			 		<td>Association</td>
			 		<td>One CashDesk is linked with many Sale</td>
			 		 </tr>
 <tr>
     <td>BelongedStore</td>
			 		<td><a  href="#Store">Store</a></td>
			 		<td>Association</td>
			 		<td>Many CashDesk are linked with one Store</td>
			 		 </tr>
</table>
<b>Sale</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Sale">Sale</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The sales order for items</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Time</td>
	<td>LocalDate</td>
	<td colspan="2">The Time of Sale</td>
	  </tr>
<tr>
       <td>IsComplete</td>
	<td>Boolean</td>
	<td colspan="2">The IsComplete of Sale</td>
	  </tr>
<tr>
       <td>Amount</td>
	<td>Real</td>
	<td colspan="2">The Amount of Sale</td>
	  </tr>
<tr>
       <td>IsReadytoPay</td>
	<td>Boolean</td>
	<td colspan="2">The IsReadytoPay of Sale</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>Belongedstore</td>
			 		<td><a  href="#Store">Store</a></td>
			 		<td>Association</td>
			 		<td>Many Sale are linked with one Store</td>
			 		 </tr>
 <tr>
     <td>BelongedCashDesk</td>
			 		<td><a  href="#CashDesk">CashDesk</a></td>
			 		<td>Association</td>
			 		<td>Many Sale are linked with one CashDesk</td>
			 		 </tr>
 <tr>
     <td>ContainedSalesLine</td>
			 		<td><a  href="#SalesLineItem">SalesLineItem</a></td>
			 		<td>Association</td>
			 		<td>One Sale is linked with many SalesLineItem</td>
			 		 </tr>
 <tr>
     <td>AssoicatedPayment</td>
			 		<td><a  href="#Payment">Payment</a></td>
			 		<td>Association</td>
			 		<td>One Sale is linked with one Payment</td>
			 		 </tr>
</table>
<b>Cashier</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Cashier">Cashier</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The cashier in store</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of Cashier</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of Cashier</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>WorkedStore</td>
			 		<td><a  href="#Store">Store</a></td>
			 		<td>Association</td>
			 		<td>Many Cashier are linked with one Store</td>
			 		 </tr>
</table>
<b>SalesLineItem</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "SalesLineItem">SalesLineItem</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The sales order for a item</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Quantity</td>
	<td>Integer</td>
	<td colspan="2">The Quantity of SalesLineItem</td>
	  </tr>
<tr>
       <td>Subamount</td>
	<td>Real</td>
	<td colspan="2">The Subamount of SalesLineItem</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>BelongedSale</td>
			 		<td><a  href="#Sale">Sale</a></td>
			 		<td>Association</td>
			 		<td>Many SalesLineItem are linked with one Sale</td>
			 		 </tr>
 <tr>
     <td>BelongedItem</td>
			 		<td><a  href="#Item">Item</a></td>
			 		<td>Association</td>
			 		<td>One SalesLineItem is linked to one Item</td>
			 		 </tr>
</table>
<b>Item</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Item">Item</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The item to be sold</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Barcode</td>
	<td>Integer</td>
	<td colspan="2">The Barcode of Item</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of Item</td>
	  </tr>
<tr>
       <td>Price</td>
	<td>Real</td>
	<td colspan="2">The Price of Item</td>
	  </tr>
<tr>
       <td>StockNumber</td>
	<td>Integer</td>
	<td colspan="2">The StockNumber of Item</td>
	  </tr>
<tr>
       <td>OrderPrice</td>
	<td>Real</td>
	<td colspan="2">The OrderPrice of Item</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>BelongedCatalog</td>
			 		<td><a  href="#ProductCatalog">ProductCatalog</a></td>
			 		<td>Association</td>
			 		<td>Many Item are linked with one ProductCatalog</td>
			 		 </tr>
</table>
<b>Payment</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Payment">Payment</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The bill for the goods sold</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>AmountTendered</td>
	<td>Real</td>
	<td colspan="2">The AmountTendered of Payment</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>BelongedSale</td>
			 		<td><a  href="#Sale">Sale</a></td>
			 		<td>Association</td>
			 		<td>One Payment is linked with one Sale</td>
			 		 </tr>
</table>
<b>CashPayment</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "CashPayment">CashPayment</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">Pay in cash</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Balance</td>
	<td>Real</td>
	<td colspan="2">The Balance of CashPayment</td>
	  </tr>
</table>
<b>CardPayment</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "CardPayment">CardPayment</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">Pay in card</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>CardAccountNumber</td>
	<td>String</td>
	<td colspan="2">The CardAccountNumber of CardPayment</td>
	  </tr>
<tr>
       <td>ExpiryDate</td>
	<td>LocalDate</td>
	<td colspan="2">The ExpiryDate of CardPayment</td>
	  </tr>
</table>
<b>OrderEntry</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "OrderEntry">OrderEntry</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The purchase order for a item</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Quantity</td>
	<td>Integer</td>
	<td colspan="2">The Quantity of OrderEntry</td>
	  </tr>
<tr>
       <td>SubAmount</td>
	<td>Real</td>
	<td colspan="2">The SubAmount of OrderEntry</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>Item</td>
			 		<td><a  href="#Item">Item</a></td>
			 		<td>Association</td>
			 		<td>One OrderEntry is linked to one Item</td>
			 		 </tr>
</table>
<b>Supplier</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "Supplier">Supplier</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The supplier of items</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of Supplier</td>
	  </tr>
<tr>
       <td>Name</td>
	<td>String</td>
	<td colspan="2">The Name of Supplier</td>
	  </tr>
</table>
<b>OrderProduct</b>
<table>
	<tr>
	       <td><b>Entity Name</b></td>
	       <td colspan="3"><span name = "OrderProduct">OrderProduct</span></td>
	   </tr>
	   <tr>
	       <td><b>Entity Description</b></td>
	       <td colspan="3">The purchase order for items</td>
	   </tr>
	   <tr>
	       <td><b>Attribute Name</b></td>
		<td><b>Attribute Type</b></td>
		<td colspan="2"><b>Attribute Description</b></td>
		  </tr>
<tr>
       <td>Id</td>
	<td>Integer</td>
	<td colspan="2">The Id of OrderProduct</td>
	  </tr>
<tr>
       <td>Time</td>
	<td>LocalDate</td>
	<td colspan="2">The Time of OrderProduct</td>
	  </tr>
<tr>
       <td>OrderStatus</td>
	<td>[NEW|RECEIVED|REQUESTED]</td>
	<td colspan="2">The OrderStatus of OrderProduct</td>
	  </tr>
<tr>
       <td>Amount</td>
	<td>Real</td>
	<td colspan="2">The Amount of OrderProduct</td>
	  </tr>
 	<tr>
 	      <td><b>Relationship Name</b></td>
 		<td><b>Related Entity</b></td>
 		<td><b>Relationship Type</b></td>
 		<td><b>Relationship Description</b></td>
 		 </tr>
 <tr>
     <td>Supplier</td>
			 		<td><a  href="#Supplier">Supplier</a></td>
			 		<td>Association</td>
			 		<td>One OrderProduct is linked to one Supplier</td>
			 		 </tr>
 <tr>
     <td>ContainedEntries</td>
			 		<td><a  href="#OrderEntry">OrderEntry</a></td>
			 		<td>Association</td>
			 		<td>One OrderProduct is linked to many OrderEntry</td>
			 		 </tr>
</table>
<h4>3.1.2.3 System Service</h4>

<b>CoCoMESystem</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "CoCoMESystem">CoCoMESystem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#openCashDesk">openCashDesk</a></li><li><a  href="#closeCashDesk">closeCashDesk</a></li><li><a  href="#openStore">openStore</a></li><li><a  href="#closeStore">closeStore</a></li><li><a  href="#changePrice">changePrice</a></li><li><a  href="#receiveOrderedProduct">receiveOrderedProduct</a></li><li><a  href="#listSuppliers">listSuppliers</a></li><li><a  href="#showStockReports">showStockReports</a></li></ul></td>
	</tr>
	<tr>
		<td><b>Temporary Variable</b></td>
		<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name = "currentCashDesk">currentCashDesk</span></td>
		<td>currentCashDesk is a instance of <a  href="#CashDesk">CashDesk</a></td>
	</tr>
	<tr>
		<td><span name = "currentStore">currentStore</span></td>
		<td>currentStore is a instance of <a  href="#Store">Store</a></td>
	</tr>
</table>
<b>ThirdPartyServices</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ThirdPartyServices">ThirdPartyServices</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#thirdPartyCardPaymentService">thirdPartyCardPaymentService</a></li></ul></td>
	</tr>
</table>
<b>ProcessSaleService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ProcessSaleService">ProcessSaleService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#makeNewSale">makeNewSale</a></li><li><a  href="#enterItem">enterItem</a></li><li><a  href="#endSale">endSale</a></li><li><a  href="#makeCashPayment">makeCashPayment</a></li><li><a  href="#makeCardPayment">makeCardPayment</a></li></ul></td>
	</tr>
	<tr>
		<td><b>Temporary Variable</b></td>
		<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name = "currentSaleLine">currentSaleLine</span></td>
		<td>currentSaleLine is a instance of <a  href="#SalesLineItem">SalesLineItem</a></td>
	</tr>
	<tr>
		<td><span name = "currentSale">currentSale</span></td>
		<td>currentSale is a instance of <a  href="#Sale">Sale</a></td>
	</tr>
	<tr>
		<td><span name = "currentPaymentMethod">currentPaymentMethod</span></td>
		<td>currentPaymentMethod has several options: [CASH|CARD]</td>
	</tr>
</table>
<b>ManageStoreCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageStoreCRUDService">ManageStoreCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createStore">createStore</a></li><li><a  href="#queryStore">queryStore</a></li><li><a  href="#modifyStore">modifyStore</a></li><li><a  href="#deleteStore">deleteStore</a></li></ul></td>
	</tr>
</table>
<b>ManageProductCatalogCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageProductCatalogCRUDService">ManageProductCatalogCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createProductCatalog">createProductCatalog</a></li><li><a  href="#queryProductCatalog">queryProductCatalog</a></li><li><a  href="#modifyProductCatalog">modifyProductCatalog</a></li><li><a  href="#deleteProductCatalog">deleteProductCatalog</a></li></ul></td>
	</tr>
</table>
<b>ManageCashDeskCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageCashDeskCRUDService">ManageCashDeskCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createCashDesk">createCashDesk</a></li><li><a  href="#queryCashDesk">queryCashDesk</a></li><li><a  href="#modifyCashDesk">modifyCashDesk</a></li><li><a  href="#deleteCashDesk">deleteCashDesk</a></li></ul></td>
	</tr>
</table>
<b>ManageCashierCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageCashierCRUDService">ManageCashierCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createCashier">createCashier</a></li><li><a  href="#queryCashier">queryCashier</a></li><li><a  href="#modifyCashier">modifyCashier</a></li><li><a  href="#deleteCashier">deleteCashier</a></li></ul></td>
	</tr>
</table>
<b>ManageItemCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageItemCRUDService">ManageItemCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createItem">createItem</a></li><li><a  href="#queryItem">queryItem</a></li><li><a  href="#modifyItem">modifyItem</a></li><li><a  href="#deleteItem">deleteItem</a></li></ul></td>
	</tr>
</table>
<b>ManageSupplierCRUDService</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "ManageSupplierCRUDService">ManageSupplierCRUDService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#createSupplier">createSupplier</a></li><li><a  href="#querySupplier">querySupplier</a></li><li><a  href="#modifySupplier">modifySupplier</a></li><li><a  href="#deleteSupplier">deleteSupplier</a></li></ul></td>
	</tr>
</table>
<b>CoCoMEOrderProducts</b>
<table>
	<tr>
		<td><b>Service Name:</b></td>
		<td><span name = "CoCoMEOrderProducts">CoCoMEOrderProducts</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td></td>
	</tr>
	<tr>
		<td><b>Operation:</b></td>
		<td><ul><li><a  href="#makeNewOrder">makeNewOrder</a></li><li><a  href="#listAllOutOfStoreProducts">listAllOutOfStoreProducts</a></li><li><a  href="#orderItem">orderItem</a></li><li><a  href="#chooseSupplier">chooseSupplier</a></li><li><a  href="#placeOrder">placeOrder</a></li></ul></td>
	</tr>
	<tr>
		<td><b>Temporary Variable</b></td>
		<td><b>Variable Description</b></td>
	</tr>
	<tr>
		<td><span name = "currentOrderProduct">currentOrderProduct</span></td>
		<td>currentOrderProduct is a instance of <a  href="#OrderProduct">OrderProduct</a></td>
	</tr>
</table>

<h4>3.1.2.4 System Operation Description</h4>
<b>openStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "openStore">openStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>openStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>storeID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>sto represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is storeID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> sto </i> exists </li><li> The attribute<i> IsOpened </i> of object<i> sto </i> is equal to false</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The <a href="#currentStore">currentStore</a> became object<i> sto </i> </li><li> The attribute<i> IsOpened </i> of object<i> sto </i> became true </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of openStore:</p>

```java

Contract CoCoMESystem::openStore(storeID : Integer) : Boolean {
definition:
/*
sto represents the object of class Store whose attribute Id is storeID
*/
sto:Store = Store.allInstance()->any(s:Store | s.Id = storeID)
precondition:
/*
The object sto exists
The attribute IsOpened of object sto is equal to false
*/
sto.oclIsUndefined() = false and
sto.IsOpened = false
postcondition:
/*
The currentStore became object sto
The attribute IsOpened of object sto became true
The return value was true
*/
self.currentStore = sto and
sto.IsOpened = true and
result = true
}
```

<b>closeStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "closeStore">closeStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>closeStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>storeID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>sto represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is storeID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> sto </i> exists </li><li> The attribute<i> IsOpened </i> of object<i> sto </i> is equal to true</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> IsOpened </i> of object<i> sto </i> became false </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of closeStore:</p>

```java

Contract CoCoMESystem::closeStore(storeID : Integer) : Boolean {
definition:
/*
sto represents the object of class Store whose attribute Id is storeID
*/
sto:Store = Store.allInstance()->any(s:Store | s.Id = storeID)
precondition:
/*
The object sto exists
The attribute IsOpened of object sto is equal to true
*/
sto.oclIsUndefined() = false and
sto.IsOpened = true
postcondition:
/*
The attribute IsOpened of object sto became false
The return value was true
*/
sto.IsOpened = false and
result = true
}
```

<b>openCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "openCashDesk">openCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>openCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>cashDeskID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cd represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is cashDeskID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cd </i> exists </li><li> The attribute<i> IsOpened </i> of object<i> cd </i> is equal to false </li><li> The <a href="#currentStore">currentStore</a> exists </li><li> The attribute<i> IsOpened </i> of <a href="#currentStore">currentStore</a> is equal to true</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The <a href="#currentCashDesk">currentCashDesk</a> became object<i> cd </i> </li><li> The attribute<i> IsOpened </i> of object<i> cd </i> became true </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of openCashDesk:</p>

```java

Contract CoCoMESystem::openCashDesk(cashDeskID : Integer) : Boolean {
definition:
/*
cd represents the object of class CashDesk whose attribute Id is cashDeskID
*/
cd:CashDesk = CashDesk.allInstance()->any(s:CashDesk | s.Id = cashDeskID)
precondition:
/*
The object cd exists
The attribute IsOpened of object cd is equal to false
The currentStore exists
The attribute IsOpened of currentStore is equal to true
*/
cd.oclIsUndefined() = false and
cd.IsOpened = false and
currentStore.oclIsUndefined() = false and
currentStore.IsOpened = true
postcondition:
/*
The currentCashDesk became object cd
The attribute IsOpened of object cd became true
The return value was true
*/
self.currentCashDesk = cd and
cd.IsOpened = true and
result = true
}
```

<b>closeCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "closeCashDesk">closeCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>closeCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>cashDeskID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cd represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is cashDeskID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cd </i> exists </li><li> The attribute<i> IsOpened </i> of object<i> cd </i> is equal to true </li><li> The <a href="#currentStore">currentStore</a> exists </li><li> The attribute<i> IsOpened </i> of <a href="#currentStore">currentStore</a> is equal to true</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The <a href="#currentCashDesk">currentCashDesk</a> became object<i> cd </i> </li><li> The attribute<i> IsOpened </i> of object<i> cd </i> became false </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of closeCashDesk:</p>

```java

Contract CoCoMESystem::closeCashDesk(cashDeskID : Integer) : Boolean {
definition:
/*
cd represents the object of class CashDesk whose attribute Id is cashDeskID
*/
cd:CashDesk = CashDesk.allInstance()->any(s:CashDesk | s.Id = cashDeskID)
precondition:
/*
The object cd exists
The attribute IsOpened of object cd is equal to true
The currentStore exists
The attribute IsOpened of currentStore is equal to true
*/
cd.oclIsUndefined() = false and
cd.IsOpened = true and
currentStore.oclIsUndefined() = false and
currentStore.IsOpened = true
postcondition:
/*
The currentCashDesk became object cd
The attribute IsOpened of object cd became false
The return value was true
*/
self.currentCashDesk = cd and
cd.IsOpened = false and
result = true
}
```

<b>makeNewSale</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "makeNewSale">makeNewSale</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>makeNewSale is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ProcessSaleService">ProcessSaleService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentCashDesk">currentCashDesk</a> exists </li><li> The attribute<i> IsOpened </i> of <a href="#currentCashDesk">currentCashDesk</a> is equal to true </li><li> The <a href="#currentSale">currentSale</a> doesn't exists , or The <a href="#currentSale">currentSale</a> exists and The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> is equal to true</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> s </i> of class <a href="#Sale">Sale</a> was created </li><li> The object<i> s </i> was linked to <a href="#currentCashDesk">currentCashDesk</a> </li><li> The <a href="#currentCashDesk">currentCashDesk</a> was linked to object<i> s </i> </li><li> The attribute<i> IsComplete </i> of object<i> s </i> became false </li><li> The attribute<i> IsReadytoPay </i> of object<i> s </i> became false </li><li> The all instance of class <a href="#Sale">Sale</a> included object<i> s </i> </li><li> The <a href="#currentSale">currentSale</a> became object<i> s </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of makeNewSale:</p>

```java

Contract ProcessSaleService::makeNewSale() : Boolean {
precondition:
/*
The currentCashDesk exists
The attribute IsOpened of currentCashDesk is equal to true
The currentSale doesn't exists , or The currentSale exists and The attribute IsComplete of currentSale is equal to true
*/
currentCashDesk.oclIsUndefined() = false and
currentCashDesk.IsOpened = true and
(currentSale.oclIsUndefined() = true or
(currentSale.oclIsUndefined() = false and
currentSale.IsComplete = true
)
)
postcondition:
/*
The object s of class Sale was created
The object s was linked to currentCashDesk
The currentCashDesk was linked to object s
The attribute IsComplete of object s became false
The attribute IsReadytoPay of object s became false
The all instance of class Sale included object s
The currentSale became object s
The return value was true
*/
let s:Sale in
s.oclIsNew() and
s.BelongedCashDesk = currentCashDesk and
currentCashDesk.ContainedSales->includes(s) and
s.IsComplete = false and
s.IsReadytoPay = false and
Sale.allInstance()->includes(s) and
self.currentSale = s and
result = true
}
```

<b>enterItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "enterItem">enterItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>enterItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ProcessSaleService">ProcessSaleService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li><li>quantity, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentSale">currentSale</a> exists </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> is equal to false </li><li> The object<i> item </i> exists </li><li> The attribute<i> StockNumber </i> of object<i> item </i> is greater than 0</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> sli </i> of class <a href="#SalesLineItem">SalesLineItem</a> was created </li><li> The <a href="#currentSaleLine">currentSaleLine</a> became object<i> sli </i> </li><li> The object<i> sli </i> was linked to <a href="#currentSale">currentSale</a> </li><li> The <a href="#currentSale">currentSale</a> was linked to object<i> sli </i> </li><li> The attribute<i> Quantity </i> of object<i> sli </i> became quantity </li><li> The object<i> sli </i> was linked to object<i> item </i> </li><li> The attribute<i> StockNumber </i> of object<i> item </i> became previous attribute<i> StockNumber </i> of object<i> item </i> minus quantity </li><li> The attribute<i> Subamount </i> of object<i> sli </i> became the product of attribute<i> Price </i> of object<i> item </i> and quantity </li><li> The all instance of class <a href="#SalesLineItem">SalesLineItem</a> included object<i> sli </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of enterItem:</p>

```java

Contract ProcessSaleService::enterItem(barcode : Integer, quantity : Integer) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(i:Item | i.Barcode = barcode)
precondition:
/*
The currentSale exists
The attribute IsComplete of currentSale is equal to false
The object item exists
The attribute StockNumber of object item is greater than 0
*/
currentSale.oclIsUndefined() = false and
currentSale.IsComplete = false and
item.oclIsUndefined() = false and
item.StockNumber > 0
postcondition:
/*
The object sli of class SalesLineItem was created
The currentSaleLine became object sli
The object sli was linked to currentSale
The currentSale was linked to object sli
The attribute Quantity of object sli became quantity
The object sli was linked to object item
The attribute StockNumber of object item became previous attribute StockNumber of object item minus quantity
The attribute Subamount of object sli became the product of attribute Price of object item and quantity
The all instance of class SalesLineItem included object sli
The return value was true
*/
let sli:SalesLineItem in
sli.oclIsNew() and
self.currentSaleLine = sli and
sli.BelongedSale = currentSale and
currentSale.ContainedSalesLine->includes(sli) and
sli.Quantity = quantity and
sli.BelongedItem = item and
item.StockNumber = item.StockNumber@pre - quantity and
sli.Subamount = item.Price * quantity and
SalesLineItem.allInstance()->includes(sli) and
result = true
}
```

<b>endSale</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "endSale">endSale</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>endSale is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ProcessSaleService">ProcessSaleService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Real</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>sls represents the set of class <a href="#SalesLineItem">SalesLineItem</a> , including all objects of class <a href="#SalesLineItem">SalesLineItem</a> which <a href="#currentSale">currentSale</a> is linked to </li><li> sub represents the set of Real , including the value of attribute<i> Subamount </i> of all objects in set sls</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentSale">currentSale</a> exists </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> is equal to false </li><li> The attribute<i> IsReadytoPay </i> of <a href="#currentSale">currentSale</a> is equal to false</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Amount </i> of <a href="#currentSale">currentSale</a> became sum of sub </li><li> The attribute<i> IsReadytoPay </i> of <a href="#currentSale">currentSale</a> became true </li><li> The return value was attribute<i> Amount </i> of <a href="#currentSale">currentSale</a></li></ol></td>
	</tr>		
</table>
<p>Contract of endSale:</p>

```java

Contract ProcessSaleService::endSale() : Real {
definition:
/*
sls represents the set of class SalesLineItem , including all objects of class SalesLineItem which currentSale is linked to
sub represents the set of Real , including the value of attribute Subamount of all objects in set sls
*/
sls:Set(SalesLineItem) = currentSale.ContainedSalesLine,
sub:Set(Real) = sls->collect(s:SalesLineItem | s.Subamount)
precondition:
/*
The currentSale exists
The attribute IsComplete of currentSale is equal to false
The attribute IsReadytoPay of currentSale is equal to false
*/
currentSale.oclIsUndefined() = false and
currentSale.IsComplete = false and
currentSale.IsReadytoPay = false
postcondition:
/*
The attribute Amount of currentSale became sum of sub
The attribute IsReadytoPay of currentSale became true
The return value was attribute Amount of currentSale
*/
currentSale.Amount = sub.sum() and
currentSale.IsReadytoPay = true and
result = currentSale.Amount
}
```

<b>makeCashPayment</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "makeCashPayment">makeCashPayment</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>makeCashPayment is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ProcessSaleService">ProcessSaleService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>amount, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentSale">currentSale</a> exists </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> is equal to false </li><li> The attribute<i> IsReadytoPay </i> of <a href="#currentSale">currentSale</a> is equal to true </li><li> The amount is greater than or equal to attribute<i> Amount </i> of <a href="#currentSale">currentSale</a></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cp </i> of class <a href="#CashPayment">CashPayment</a> was created </li><li> The attribute<i> AmountTendered </i> of object<i> cp </i> became amount </li><li> The object<i> cp </i> was linked to <a href="#currentSale">currentSale</a> </li><li> The <a href="#currentSale">currentSale</a> was linked to object<i> cp </i> </li><li> The <a href="#currentSale">currentSale</a> was linked to <a href="#currentStore">currentStore</a> </li><li> The <a href="#currentStore">currentStore</a> was linked to <a href="#currentSale">currentSale</a> </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> became true </li><li> The attribute<i> Time </i> of <a href="#currentSale">currentSale</a> was equal to Now </li><li> The attribute<i> Balance </i> of object<i> cp </i> became amount minus attribute<i> Amount </i> of <a href="#currentSale">currentSale</a> </li><li> The all instance of class <a href="#CashPayment">CashPayment</a> included object<i> cp </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of makeCashPayment:</p>

```java

Contract ProcessSaleService::makeCashPayment(amount : Real) : Boolean {
precondition:
/*
The currentSale exists
The attribute IsComplete of currentSale is equal to false
The attribute IsReadytoPay of currentSale is equal to true
The amount is greater than or equal to attribute Amount of currentSale
*/
currentSale.oclIsUndefined() = false and
currentSale.IsComplete = false and
currentSale.IsReadytoPay = true and
amount >= currentSale.Amount
postcondition:
/*
The object cp of class CashPayment was created
The attribute AmountTendered of object cp became amount
The object cp was linked to currentSale
The currentSale was linked to object cp
The currentSale was linked to currentStore
The currentStore was linked to currentSale
The attribute IsComplete of currentSale became true
The attribute Time of currentSale was equal to Now
The attribute Balance of object cp became amount minus attribute Amount of currentSale
The all instance of class CashPayment included object cp
The return value was true
*/
let cp:CashPayment in
cp.oclIsNew() and
cp.AmountTendered = amount and
cp.BelongedSale = currentSale and
currentSale.AssoicatedPayment = cp and
currentSale.Belongedstore = currentStore and
currentStore.Sales->includes(currentSale) and
currentSale.IsComplete = true and
currentSale.Time.isEqual(Now) and
cp.Balance = amount - currentSale.Amount and
CashPayment.allInstance()->includes(cp) and
result = true
}
```

<b>makeCardPayment</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "makeCardPayment">makeCardPayment</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>makeCardPayment is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ProcessSaleService">ProcessSaleService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>cardAccountNumber, type: String</li><li>expiryDate, type: LocalDate</li><li>fee, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentSale">currentSale</a> exists </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> is equal to false </li><li> The attribute<i> IsReadytoPay </i> of <a href="#currentSale">currentSale</a> is equal to true </li><li> Perform operation thirdPartyCardPaymentService ( cardAccountNumber , expiryDate , fee )</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cdp </i> of class <a href="#CardPayment">CardPayment</a> was created </li><li> The attribute<i> AmountTendered </i> of object<i> cdp </i> became fee </li><li> The object<i> cdp </i> was linked to <a href="#currentSale">currentSale</a> </li><li> The <a href="#currentSale">currentSale</a> was linked to object<i> cdp </i> </li><li> The attribute<i> CardAccountNumber </i> of object<i> cdp </i> became cardAccountNumber </li><li> The attribute<i> ExpiryDate </i> of object<i> cdp </i> became expiryDate </li><li> The all instance of class <a href="#CardPayment">CardPayment</a> included object<i> cdp </i> </li><li> The <a href="#currentSale">currentSale</a> was linked to <a href="#currentStore">currentStore</a> </li><li> The <a href="#currentStore">currentStore</a> was linked to <a href="#currentSale">currentSale</a> </li><li> The attribute<i> IsComplete </i> of <a href="#currentSale">currentSale</a> became true </li><li> The attribute<i> Time </i> of <a href="#currentSale">currentSale</a> was equal to Now </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of makeCardPayment:</p>

```java

Contract ProcessSaleService::makeCardPayment(cardAccountNumber : String, expiryDate : Date, fee: Real) : Boolean {
precondition:
/*
The currentSale exists
The attribute IsComplete of currentSale is equal to false
The attribute IsReadytoPay of currentSale is equal to true
Perform operation thirdPartyCardPaymentService ( cardAccountNumber , expiryDate , fee )
*/
currentSale.oclIsUndefined() = false and
currentSale.IsComplete = false and
currentSale.IsReadytoPay = true and
thirdPartyCardPaymentService(cardAccountNumber, expiryDate, fee)
postcondition:
/*
The object cdp of class CardPayment was created
The attribute AmountTendered of object cdp became fee
The object cdp was linked to currentSale
The currentSale was linked to object cdp
The attribute CardAccountNumber of object cdp became cardAccountNumber
The attribute ExpiryDate of object cdp became expiryDate
The all instance of class CardPayment included object cdp
The currentSale was linked to currentStore
The currentStore was linked to currentSale
The attribute IsComplete of currentSale became true
The attribute Time of currentSale was equal to Now
The return value was true
*/
let cdp:CardPayment in
cdp.oclIsNew() and
cdp.AmountTendered = fee and
cdp.BelongedSale = currentSale and
currentSale.AssoicatedPayment = cdp and
cdp.CardAccountNumber = cardAccountNumber and
cdp.ExpiryDate = expiryDate and
CardPayment.allInstance()->includes(cdp) and
currentSale.Belongedstore = currentStore and
currentStore.Sales->includes(currentSale) and
currentSale.IsComplete = true and
currentSale.Time.isEqual(Now) and
result = true
}
```

<b>thirdPartyCardPaymentService</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "thirdPartyCardPaymentService">thirdPartyCardPaymentService</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>thirdPartyCardPaymentService is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ThirdPartyServices">ThirdPartyServices</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>cardAccountNumber, type: String</li><li>expiryDate, type: LocalDate</li><li>fee, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>None</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of thirdPartyCardPaymentService:</p>

```java

Contract  ThirdPartyServices::thirdPartyCardPaymentService(cardAccountNumber : String, expiryDate : Date, fee : Real) : Boolean {
precondition:
/*
null
*/
true
postcondition:
/*
The return value was true
*/
result = true
}
```

<b>makeNewOrder</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "makeNewOrder">makeNewOrder</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>makeNewOrder is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMEOrderProducts">CoCoMEOrderProducts</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>orderid, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>None</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> op </i> of class <a href="#OrderProduct">OrderProduct</a> was created </li><li> The attribute<i> OrderStatus </i> of object<i> op </i> became NEW </li><li> The attribute<i> Id </i> of object<i> op </i> became orderid </li><li> The attribute<i> Time </i> of object<i> op </i> was equal to Now </li><li> The all instance of class <a href="#OrderProduct">OrderProduct</a> included object<i> op </i> </li><li> The <a href="#currentOrderProduct">currentOrderProduct</a> became object<i> op </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of makeNewOrder:</p>

```java

Contract CoCoMEOrderProducts::makeNewOrder(orderid : Integer) : Boolean {
precondition:
/*
null
*/
true
postcondition:
/*
The object op of class OrderProduct was created
The attribute OrderStatus of object op became NEW
The attribute Id of object op became orderid
The attribute Time of object op was equal to Now
The all instance of class OrderProduct included object op
The currentOrderProduct became object op
The return value was true
*/
let op:OrderProduct in
op.oclIsNew() and
op.OrderStatus = OrderStatus::NEW and
op.Id = orderid and
op.Time.isEqual(Now) and
OrderProduct.allInstance()->includes(op) and
self.currentOrderProduct = op and
result = true
}
```

<b>listAllOutOfStoreProducts</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "listAllOutOfStoreProducts">listAllOutOfStoreProducts</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>listAllOutOfStoreProducts is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMEOrderProducts">CoCoMEOrderProducts</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Set of Item</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>None</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was all instance of class <a href="#Item">Item</a> whose attribute<i> StockNumber </i> was 0</li></ol></td>
	</tr>		
</table>
<p>Contract of listAllOutOfStoreProducts:</p>

```java

Contract CoCoMEOrderProducts::listAllOutOfStoreProducts() : Set(Item) {
precondition:
/*
null
*/
true
postcondition:
/*
The return value was all instance of class Item whose attribute StockNumber was 0
*/
result = Item.allInstance()->select(item:Item | item.StockNumber = 0)
}
```

<b>orderItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "orderItem">orderItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>orderItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMEOrderProducts">CoCoMEOrderProducts</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li><li>quantity, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> order </i> of class <a href="#OrderEntry">OrderEntry</a> was created </li><li> The attribute<i> Quantity </i> of object<i> order </i> became quantity </li><li> The attribute subAmount of object<i> order </i> became the product of attribute<i> OrderPrice </i> of object<i> item </i> and quantity </li><li> The object<i> order </i> was linked to object<i> item </i> </li><li> The all instance of class <a href="#OrderEntry">OrderEntry</a> included object<i> order </i> </li><li> The <a href="#currentOrderProduct">currentOrderProduct</a> was linked to object<i> order </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of orderItem:</p>

```java

Contract CoCoMEOrderProducts::orderItem(barcode: Integer, quantity : Integer) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(i:Item | i.Barcode = barcode)
precondition:
/*
The object item exists
*/
item.oclIsUndefined() = false
postcondition:
/*
The object order of class OrderEntry was created
The attribute Quantity of object order became quantity
The attribute subAmount of object order became the product of attribute OrderPrice of object item and quantity
The object order was linked to object item
The all instance of class OrderEntry included object order
The currentOrderProduct was linked to object order
The return value was true
*/
let order:OrderEntry in
order.oclIsNew() and
order.Quantity = quantity and
order.subAmount = item.OrderPrice * quantity and
order.Item = item and
OrderEntry.allInstance()->includes(order) and
currentOrderProduct.ContainedEntries->includes(order) and
result = true
}
```

<b>chooseSupplier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "chooseSupplier">chooseSupplier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>chooseSupplier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMEOrderProducts">CoCoMEOrderProducts</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>supplierID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>sup represents the object of class <a href="#Supplier">Supplier</a> whose attribute<i> Id </i> is supplierID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> sup </i> exists </li><li> The <a href="#currentOrderProduct">currentOrderProduct</a> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The <a href="#currentOrderProduct">currentOrderProduct</a> was linked to object<i> sup </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of chooseSupplier:</p>

```java

Contract CoCoMEOrderProducts::chooseSupplier(supplierID : Integer) : Boolean {
definition:
/*
sup represents the object of class Supplier whose attribute Id is supplierID
*/
sup:Supplier = Supplier.allInstance()->any(s:Supplier | s.Id = supplierID)
precondition:
/*
The object sup exists
The currentOrderProduct exists
*/
sup.oclIsUndefined() = false and
currentOrderProduct.oclIsUndefined() = false
postcondition:
/*
The currentOrderProduct was linked to object sup
The return value was true
*/
currentOrderProduct.Supplier = sup and
result = true
}
```

<b>placeOrder</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "placeOrder">placeOrder</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>placeOrder is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMEOrderProducts">CoCoMEOrderProducts</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The <a href="#currentOrderProduct">currentOrderProduct</a> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> OrderStatus </i> of <a href="#currentOrderProduct">currentOrderProduct</a> became REQUESTED </li><li> The attribute<i> Amount </i> of <a href="#currentOrderProduct">currentOrderProduct</a> became the sum of previous attribute<i> Amount </i> of <a href="#currentOrderProduct">currentOrderProduct</a> and all attribute<i> SubAmount </i> of class <a href="#OrderEntry">OrderEntry</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of placeOrder:</p>

```java

Contract CoCoMEOrderProducts::placeOrder() : Boolean {
precondition:
/*
The currentOrderProduct exists
*/
currentOrderProduct.oclIsUndefined() = false
postcondition:
/*
The attribute OrderStatus of currentOrderProduct became REQUESTED
The attribute Amount of currentOrderProduct became the sum of previous attribute Amount of currentOrderProduct and all attribute SubAmount of class OrderEntry
The return value was true
*/
currentOrderProduct.OrderStatus = OrderStatus::REQUESTED and
currentOrderProduct.ContainedEntries->forAll(o:OrderEntry |
currentOrderProduct.Amount = currentOrderProduct.Amount@pre + o.SubAmount)
and
result = true
}
```

<b>changePrice</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "changePrice">changePrice</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>changePrice is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li><li>newPrice, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Price </i> of object<i> item </i> became newPrice </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of changePrice:</p>

```java

Contract CoCoMESystem::changePrice(barcode : Integer, newPrice : Real) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(i:Item | i.Barcode = barcode)
precondition:
/*
The object item exists
*/
item.oclIsUndefined() = false
postcondition:
/*
The attribute Price of object item became newPrice
The return value was true
*/
item.Price = newPrice and
result = true
}
```

<b>receiveOrderedProduct</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "receiveOrderedProduct">receiveOrderedProduct</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>receiveOrderedProduct is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>orderID, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>op represents the object of class <a href="#OrderProduct">OrderProduct</a> whose attribute<i> Id </i> is orderID</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> op </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> OrderStatus </i> of object<i> op </i> became RECEIVED </li><li> The attribute<i> StockNumber </i> of all <a href="#Item">Item</a> in object<i> op </i> was updated, which became the sum of previous attribute<i> StockNumber </i> of <a href="#Item">Item</a> and attribute<i> Quantity </i> of class <a href="#OrderEntry">OrderEntry</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of receiveOrderedProduct:</p>

```java

Contract CoCoMESystem::receiveOrderedProduct(orderID : Integer) : Boolean {
definition:
/*
op represents the object of class OrderProduct whose attribute Id is orderID
*/
op:OrderProduct = OrderProduct.allInstance()->any(i:OrderProduct | i.Id = orderID)
precondition:
/*
The object op exists
*/
op.oclIsUndefined() = false
postcondition:
/*
The attribute OrderStatus of object op became RECEIVED
The attribute StockNumber of all Item in object op was updated, which became the sum of previous attribute StockNumber of Item and attribute Quantity of class OrderEntry
The return value was true
*/
op.OrderStatus = OrderStatus::RECEIVED and
op.ContainedEntries->forAll(oe:OrderEntry |
oe.Item.StockNumber = oe.Item.StockNumber@pre + oe.Quantity)
and
result = true
}
```

<b>listSuppliers</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "listSuppliers">listSuppliers</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>listSuppliers is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Set of Supplier</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>None</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was all instance of class <a href="#Supplier">Supplier</a></li></ol></td>
	</tr>		
</table>
<p>Contract of listSuppliers:</p>

```java

Contract CoCoMESystem::listSuppliers() : Set(Supplier) {
precondition:
/*
null
*/
true
postcondition:
/*
The return value was all instance of class Supplier
*/
result = Supplier.allInstance()
}
```

<b>showStockReports</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "showStockReports">showStockReports</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>showStockReports is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#CoCoMESystem">CoCoMESystem</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td>Null</td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Set of Item</td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>None</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was all instance of class <a href="#Item">Item</a></li></ol></td>
	</tr>		
</table>
<p>Contract of showStockReports:</p>

```java

Contract CoCoMESystem::showStockReports() : Set(Item) {
precondition:
/*
null
*/
true
postcondition:
/*
The return value was all instance of class Item
*/
result = Item.allInstance()
}
```

<b>createStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createStore">createStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageStoreCRUDService">ManageStoreCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li><li>address, type: String</li><li>isopened, type: Boolean</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>store represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> store </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> sto </i> of class <a href="#Store">Store</a> was created </li><li> The attribute<i> Id </i> of object<i> sto </i> became id </li><li> The attribute<i> Name </i> of object<i> sto </i> became name </li><li> The attribute<i> Address </i> of object<i> sto </i> became address </li><li> The attribute<i> IsOpened </i> of object<i> sto </i> became isopened </li><li> The all instance of class <a href="#Store">Store</a> included object<i> sto </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createStore:</p>

```java

Contract  ManageStoreCRUDService::createStore(id : Integer, name : String, address : String, isopened : Boolean) : Boolean {
definition:
/*
store represents the object of class Store whose attribute Id is id
*/
store:Store = Store.allInstance()->any(sto:Store | sto.Id = id)
precondition:
/*
The object store doesn't exists
*/
store.oclIsUndefined() = true
postcondition:
/*
The object sto of class Store was created
The attribute Id of object sto became id
The attribute Name of object sto became name
The attribute Address of object sto became address
The attribute IsOpened of object sto became isopened
The all instance of class Store included object sto
The return value was true
*/
let sto:Store in
sto.oclIsNew() and
sto.Id = id and
sto.Name = name and
sto.Address = address and
sto.IsOpened = isopened and
Store.allInstance()->includes(sto) and
result = true
}
```

<b>queryStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "queryStore">queryStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>queryStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageStoreCRUDService">ManageStoreCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Store</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>store represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> store </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was store</li></ol></td>
	</tr>		
</table>
<p>Contract of queryStore:</p>

```java

Contract  ManageStoreCRUDService::queryStore(id : Integer) : Store {
definition:
/*
store represents the object of class Store whose attribute Id is id
*/
store:Store = Store.allInstance()->any(sto:Store | sto.Id = id)
precondition:
/*
The object store exists
*/
store.oclIsUndefined() = false
postcondition:
/*
The return value was store
*/
result = store
}
```

<b>modifyStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifyStore">modifyStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifyStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageStoreCRUDService">ManageStoreCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li><li>address, type: String</li><li>isopened, type: Boolean</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>store represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> store </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Id </i> of object<i> store </i> became id </li><li> The attribute<i> Name </i> of object<i> store </i> became name </li><li> The attribute<i> Address </i> of object<i> store </i> became address </li><li> The attribute<i> IsOpened </i> of object<i> store </i> became isopened </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifyStore:</p>

```java

Contract  ManageStoreCRUDService::modifyStore(id : Integer, name : String, address : String, isopened : Boolean) : Boolean {
definition:
/*
store represents the object of class Store whose attribute Id is id
*/
store:Store = Store.allInstance()->any(sto:Store | sto.Id = id)
precondition:
/*
The object store exists
*/
store.oclIsUndefined() = false
postcondition:
/*
The attribute Id of object store became id
The attribute Name of object store became name
The attribute Address of object store became address
The attribute IsOpened of object store became isopened
The return value was true
*/
store.Id = id and
store.Name = name and
store.Address = address and
store.IsOpened = isopened and
result = true
}
```

<b>deleteStore</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteStore">deleteStore</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteStore is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageStoreCRUDService">ManageStoreCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>store represents the object of class <a href="#Store">Store</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> store </i> exists </li><li> The all instance of class <a href="#Store">Store</a> includes object<i> store </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> store </i> was deleted from all instance of class <a href="#Store">Store</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteStore:</p>

```java

Contract  ManageStoreCRUDService::deleteStore(id : Integer) : Boolean {
definition:
/*
store represents the object of class Store whose attribute Id is id
*/
store:Store = Store.allInstance()->any(sto:Store | sto.Id = id)
precondition:
/*
The object store exists
The all instance of class Store includes object store
*/
store.oclIsUndefined() = false and
Store.allInstance()->includes(store)
postcondition:
/*
The object store was deleted from all instance of class Store
The return value was true
*/
Store.allInstance()->excludes(store) and
result = true
}
```

<b>createProductCatalog</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createProductCatalog">createProductCatalog</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createProductCatalog is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageProductCatalogCRUDService">ManageProductCatalogCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>productcatalog represents the object of class <a href="#ProductCatalog">ProductCatalog</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> productcatalog </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> pro </i> of class <a href="#ProductCatalog">ProductCatalog</a> was created </li><li> The attribute<i> Id </i> of object<i> pro </i> became id </li><li> The attribute<i> Name </i> of object<i> pro </i> became name </li><li> The all instance of class <a href="#ProductCatalog">ProductCatalog</a> included object<i> pro </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createProductCatalog:</p>

```java

Contract  ManageProductCatalogCRUDService::createProductCatalog(id : Integer, name : String) : Boolean {
definition:
/*
productcatalog represents the object of class ProductCatalog whose attribute Id is id
*/
productcatalog:ProductCatalog = ProductCatalog.allInstance()->any(pro:ProductCatalog | pro.Id = id)
precondition:
/*
The object productcatalog doesn't exists
*/
productcatalog.oclIsUndefined() = true
postcondition:
/*
The object pro of class ProductCatalog was created
The attribute Id of object pro became id
The attribute Name of object pro became name
The all instance of class ProductCatalog included object pro
The return value was true
*/
let pro:ProductCatalog in
pro.oclIsNew() and
pro.Id = id and
pro.Name = name and
ProductCatalog.allInstance()->includes(pro) and
result = true
}
```

<b>queryProductCatalog</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "queryProductCatalog">queryProductCatalog</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>queryProductCatalog is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageProductCatalogCRUDService">ManageProductCatalogCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>ProductCatalog</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>productcatalog represents the object of class <a href="#ProductCatalog">ProductCatalog</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> productcatalog </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was productcatalog</li></ol></td>
	</tr>		
</table>
<p>Contract of queryProductCatalog:</p>

```java

Contract  ManageProductCatalogCRUDService::queryProductCatalog(id : Integer) : ProductCatalog {
definition:
/*
productcatalog represents the object of class ProductCatalog whose attribute Id is id
*/
productcatalog:ProductCatalog = ProductCatalog.allInstance()->any(pro:ProductCatalog | pro.Id = id)
precondition:
/*
The object productcatalog exists
*/
productcatalog.oclIsUndefined() = false
postcondition:
/*
The return value was productcatalog
*/
result = productcatalog
}
```

<b>modifyProductCatalog</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifyProductCatalog">modifyProductCatalog</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifyProductCatalog is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageProductCatalogCRUDService">ManageProductCatalogCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>productcatalog represents the object of class <a href="#ProductCatalog">ProductCatalog</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> productcatalog </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Id </i> of object<i> productcatalog </i> became id </li><li> The attribute<i> Name </i> of object<i> productcatalog </i> became name </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifyProductCatalog:</p>

```java

Contract  ManageProductCatalogCRUDService::modifyProductCatalog(id : Integer, name : String) : Boolean {
definition:
/*
productcatalog represents the object of class ProductCatalog whose attribute Id is id
*/
productcatalog:ProductCatalog = ProductCatalog.allInstance()->any(pro:ProductCatalog | pro.Id = id)
precondition:
/*
The object productcatalog exists
*/
productcatalog.oclIsUndefined() = false
postcondition:
/*
The attribute Id of object productcatalog became id
The attribute Name of object productcatalog became name
The return value was true
*/
productcatalog.Id = id and
productcatalog.Name = name and
result = true
}
```

<b>deleteProductCatalog</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteProductCatalog">deleteProductCatalog</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteProductCatalog is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageProductCatalogCRUDService">ManageProductCatalogCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>productcatalog represents the object of class <a href="#ProductCatalog">ProductCatalog</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> productcatalog </i> exists </li><li> The all instance of class <a href="#ProductCatalog">ProductCatalog</a> includes object<i> productcatalog </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> productcatalog </i> was deleted from all instance of class <a href="#ProductCatalog">ProductCatalog</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteProductCatalog:</p>

```java

Contract  ManageProductCatalogCRUDService::deleteProductCatalog(id : Integer) : Boolean {
definition:
/*
productcatalog represents the object of class ProductCatalog whose attribute Id is id
*/
productcatalog:ProductCatalog = ProductCatalog.allInstance()->any(pro:ProductCatalog | pro.Id = id)
precondition:
/*
The object productcatalog exists
The all instance of class ProductCatalog includes object productcatalog
*/
productcatalog.oclIsUndefined() = false and
ProductCatalog.allInstance()->includes(productcatalog)
postcondition:
/*
The object productcatalog was deleted from all instance of class ProductCatalog
The return value was true
*/
ProductCatalog.allInstance()->excludes(productcatalog) and
result = true
}
```

<b>createCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createCashDesk">createCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashDeskCRUDService">ManageCashDeskCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li><li>isopened, type: Boolean</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashdesk represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashdesk </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cas </i> of class <a href="#CashDesk">CashDesk</a> was created </li><li> The attribute<i> Id </i> of object<i> cas </i> became id </li><li> The attribute<i> Name </i> of object<i> cas </i> became name </li><li> The attribute<i> IsOpened </i> of object<i> cas </i> became isopened </li><li> The all instance of class <a href="#CashDesk">CashDesk</a> included object<i> cas </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createCashDesk:</p>

```java

Contract  ManageCashDeskCRUDService::createCashDesk(id : Integer, name : String, isopened : Boolean) : Boolean {
definition:
/*
cashdesk represents the object of class CashDesk whose attribute Id is id
*/
cashdesk:CashDesk = CashDesk.allInstance()->any(cas:CashDesk | cas.Id = id)
precondition:
/*
The object cashdesk doesn't exists
*/
cashdesk.oclIsUndefined() = true
postcondition:
/*
The object cas of class CashDesk was created
The attribute Id of object cas became id
The attribute Name of object cas became name
The attribute IsOpened of object cas became isopened
The all instance of class CashDesk included object cas
The return value was true
*/
let cas:CashDesk in
cas.oclIsNew() and
cas.Id = id and
cas.Name = name and
cas.IsOpened = isopened and
CashDesk.allInstance()->includes(cas) and
result = true
}
```

<b>queryCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "queryCashDesk">queryCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>queryCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashDeskCRUDService">ManageCashDeskCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>CashDesk</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashdesk represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashdesk </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was cashdesk</li></ol></td>
	</tr>		
</table>
<p>Contract of queryCashDesk:</p>

```java

Contract  ManageCashDeskCRUDService::queryCashDesk(id : Integer) : CashDesk {
definition:
/*
cashdesk represents the object of class CashDesk whose attribute Id is id
*/
cashdesk:CashDesk = CashDesk.allInstance()->any(cas:CashDesk | cas.Id = id)
precondition:
/*
The object cashdesk exists
*/
cashdesk.oclIsUndefined() = false
postcondition:
/*
The return value was cashdesk
*/
result = cashdesk
}
```

<b>modifyCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifyCashDesk">modifyCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifyCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashDeskCRUDService">ManageCashDeskCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li><li>isopened, type: Boolean</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashdesk represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashdesk </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Id </i> of object<i> cashdesk </i> became id </li><li> The attribute<i> Name </i> of object<i> cashdesk </i> became name </li><li> The attribute<i> IsOpened </i> of object<i> cashdesk </i> became isopened </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifyCashDesk:</p>

```java

Contract  ManageCashDeskCRUDService::modifyCashDesk(id : Integer, name : String, isopened : Boolean) : Boolean {
definition:
/*
cashdesk represents the object of class CashDesk whose attribute Id is id
*/
cashdesk:CashDesk = CashDesk.allInstance()->any(cas:CashDesk | cas.Id = id)
precondition:
/*
The object cashdesk exists
*/
cashdesk.oclIsUndefined() = false
postcondition:
/*
The attribute Id of object cashdesk became id
The attribute Name of object cashdesk became name
The attribute IsOpened of object cashdesk became isopened
The return value was true
*/
cashdesk.Id = id and
cashdesk.Name = name and
cashdesk.IsOpened = isopened and
result = true
}
```

<b>deleteCashDesk</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteCashDesk">deleteCashDesk</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteCashDesk is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashDeskCRUDService">ManageCashDeskCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashdesk represents the object of class <a href="#CashDesk">CashDesk</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashdesk </i> exists </li><li> The all instance of class <a href="#CashDesk">CashDesk</a> includes object<i> cashdesk </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cashdesk </i> was deleted from all instance of class <a href="#CashDesk">CashDesk</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteCashDesk:</p>

```java

Contract  ManageCashDeskCRUDService::deleteCashDesk(id : Integer) : Boolean {
definition:
/*
cashdesk represents the object of class CashDesk whose attribute Id is id
*/
cashdesk:CashDesk = CashDesk.allInstance()->any(cas:CashDesk | cas.Id = id)
precondition:
/*
The object cashdesk exists
The all instance of class CashDesk includes object cashdesk
*/
cashdesk.oclIsUndefined() = false and
CashDesk.allInstance()->includes(cashdesk)
postcondition:
/*
The object cashdesk was deleted from all instance of class CashDesk
The return value was true
*/
CashDesk.allInstance()->excludes(cashdesk) and
result = true
}
```

<b>createCashier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createCashier">createCashier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createCashier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashierCRUDService">ManageCashierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashier represents the object of class <a href="#Cashier">Cashier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashier </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cas </i> of class <a href="#Cashier">Cashier</a> was created </li><li> The attribute<i> Id </i> of object<i> cas </i> became id </li><li> The attribute<i> Name </i> of object<i> cas </i> became name </li><li> The all instance of class <a href="#Cashier">Cashier</a> included object<i> cas </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createCashier:</p>

```java

Contract  ManageCashierCRUDService::createCashier(id : Integer, name : String) : Boolean {
definition:
/*
cashier represents the object of class Cashier whose attribute Id is id
*/
cashier:Cashier = Cashier.allInstance()->any(cas:Cashier | cas.Id = id)
precondition:
/*
The object cashier doesn't exists
*/
cashier.oclIsUndefined() = true
postcondition:
/*
The object cas of class Cashier was created
The attribute Id of object cas became id
The attribute Name of object cas became name
The all instance of class Cashier included object cas
The return value was true
*/
let cas:Cashier in
cas.oclIsNew() and
cas.Id = id and
cas.Name = name and
Cashier.allInstance()->includes(cas) and
result = true
}
```

<b>queryCashier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "queryCashier">queryCashier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>queryCashier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashierCRUDService">ManageCashierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Cashier</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashier represents the object of class <a href="#Cashier">Cashier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashier </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was cashier</li></ol></td>
	</tr>		
</table>
<p>Contract of queryCashier:</p>

```java

Contract  ManageCashierCRUDService::queryCashier(id : Integer) : Cashier {
definition:
/*
cashier represents the object of class Cashier whose attribute Id is id
*/
cashier:Cashier = Cashier.allInstance()->any(cas:Cashier | cas.Id = id)
precondition:
/*
The object cashier exists
*/
cashier.oclIsUndefined() = false
postcondition:
/*
The return value was cashier
*/
result = cashier
}
```

<b>modifyCashier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifyCashier">modifyCashier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifyCashier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashierCRUDService">ManageCashierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashier represents the object of class <a href="#Cashier">Cashier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashier </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Id </i> of object<i> cashier </i> became id </li><li> The attribute<i> Name </i> of object<i> cashier </i> became name </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifyCashier:</p>

```java

Contract  ManageCashierCRUDService::modifyCashier(id : Integer, name : String) : Boolean {
definition:
/*
cashier represents the object of class Cashier whose attribute Id is id
*/
cashier:Cashier = Cashier.allInstance()->any(cas:Cashier | cas.Id = id)
precondition:
/*
The object cashier exists
*/
cashier.oclIsUndefined() = false
postcondition:
/*
The attribute Id of object cashier became id
The attribute Name of object cashier became name
The return value was true
*/
cashier.Id = id and
cashier.Name = name and
result = true
}
```

<b>deleteCashier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteCashier">deleteCashier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteCashier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageCashierCRUDService">ManageCashierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>cashier represents the object of class <a href="#Cashier">Cashier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> cashier </i> exists </li><li> The all instance of class <a href="#Cashier">Cashier</a> includes object<i> cashier </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> cashier </i> was deleted from all instance of class <a href="#Cashier">Cashier</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteCashier:</p>

```java

Contract  ManageCashierCRUDService::deleteCashier(id : Integer) : Boolean {
definition:
/*
cashier represents the object of class Cashier whose attribute Id is id
*/
cashier:Cashier = Cashier.allInstance()->any(cas:Cashier | cas.Id = id)
precondition:
/*
The object cashier exists
The all instance of class Cashier includes object cashier
*/
cashier.oclIsUndefined() = false and
Cashier.allInstance()->includes(cashier)
postcondition:
/*
The object cashier was deleted from all instance of class Cashier
The return value was true
*/
Cashier.allInstance()->excludes(cashier) and
result = true
}
```

<b>createItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createItem">createItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageItemCRUDService">ManageItemCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li><li>name, type: String</li><li>price, type: Real</li><li>stocknumber, type: Integer</li><li>orderprice, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> ite </i> of class <a href="#Item">Item</a> was created </li><li> The attribute<i> Barcode </i> of object<i> ite </i> became barcode </li><li> The attribute<i> Name </i> of object<i> ite </i> became name </li><li> The attribute<i> Price </i> of object<i> ite </i> became price </li><li> The attribute<i> StockNumber </i> of object<i> ite </i> became stocknumber </li><li> The attribute<i> OrderPrice </i> of object<i> ite </i> became orderprice </li><li> The all instance of class <a href="#Item">Item</a> included object<i> ite </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createItem:</p>

```java

Contract  ManageItemCRUDService::createItem(barcode : Integer, name : String, price : Real, stocknumber : Integer, orderprice : Real) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(ite:Item | ite.Barcode = barcode)
precondition:
/*
The object item doesn't exists
*/
item.oclIsUndefined() = true
postcondition:
/*
The object ite of class Item was created
The attribute Barcode of object ite became barcode
The attribute Name of object ite became name
The attribute Price of object ite became price
The attribute StockNumber of object ite became stocknumber
The attribute OrderPrice of object ite became orderprice
The all instance of class Item included object ite
The return value was true
*/
let ite:Item in
ite.oclIsNew() and
ite.Barcode = barcode and
ite.Name = name and
ite.Price = price and
ite.StockNumber = stocknumber and
ite.OrderPrice = orderprice and
Item.allInstance()->includes(ite) and
result = true
}
```

<b>queryItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "queryItem">queryItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>queryItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageItemCRUDService">ManageItemCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Item</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was item</li></ol></td>
	</tr>		
</table>
<p>Contract of queryItem:</p>

```java

Contract  ManageItemCRUDService::queryItem(barcode : Integer) : Item {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(ite:Item | ite.Barcode = barcode)
precondition:
/*
The object item exists
*/
item.oclIsUndefined() = false
postcondition:
/*
The return value was item
*/
result = item
}
```

<b>modifyItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifyItem">modifyItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifyItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageItemCRUDService">ManageItemCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li><li>name, type: String</li><li>price, type: Real</li><li>stocknumber, type: Integer</li><li>orderprice, type: Real</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Barcode </i> of object<i> item </i> became barcode </li><li> The attribute<i> Name </i> of object<i> item </i> became name </li><li> The attribute<i> Price </i> of object<i> item </i> became price </li><li> The attribute<i> StockNumber </i> of object<i> item </i> became stocknumber </li><li> The attribute<i> OrderPrice </i> of object<i> item </i> became orderprice </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifyItem:</p>

```java

Contract  ManageItemCRUDService::modifyItem(barcode : Integer, name : String, price : Real, stocknumber : Integer, orderprice : Real) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(ite:Item | ite.Barcode = barcode)
precondition:
/*
The object item exists
*/
item.oclIsUndefined() = false
postcondition:
/*
The attribute Barcode of object item became barcode
The attribute Name of object item became name
The attribute Price of object item became price
The attribute StockNumber of object item became stocknumber
The attribute OrderPrice of object item became orderprice
The return value was true
*/
item.Barcode = barcode and
item.Name = name and
item.Price = price and
item.StockNumber = stocknumber and
item.OrderPrice = orderprice and
result = true
}
```

<b>deleteItem</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteItem">deleteItem</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteItem is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageItemCRUDService">ManageItemCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>barcode, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>item represents the object of class <a href="#Item">Item</a> whose attribute<i> Barcode </i> is barcode</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> item </i> exists </li><li> The all instance of class <a href="#Item">Item</a> includes object<i> item </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> item </i> was deleted from all instance of class <a href="#Item">Item</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteItem:</p>

```java

Contract  ManageItemCRUDService::deleteItem(barcode : Integer) : Boolean {
definition:
/*
item represents the object of class Item whose attribute Barcode is barcode
*/
item:Item = Item.allInstance()->any(ite:Item | ite.Barcode = barcode)
precondition:
/*
The object item exists
The all instance of class Item includes object item
*/
item.oclIsUndefined() = false and
Item.allInstance()->includes(item)
postcondition:
/*
The object item was deleted from all instance of class Item
The return value was true
*/
Item.allInstance()->excludes(item) and
result = true
}
```

<b>createSupplier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "createSupplier">createSupplier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>createSupplier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageSupplierCRUDService">ManageSupplierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>supplier represents the object of class <a href="#Supplier">Supplier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> supplier </i> doesn't exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> sup </i> of class <a href="#Supplier">Supplier</a> was created </li><li> The attribute<i> Id </i> of object<i> sup </i> became id </li><li> The attribute<i> Name </i> of object<i> sup </i> became name </li><li> The all instance of class <a href="#Supplier">Supplier</a> included object<i> sup </i> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of createSupplier:</p>

```java

Contract  ManageSupplierCRUDService::createSupplier(id : Integer, name : String) : Boolean {
definition:
/*
supplier represents the object of class Supplier whose attribute Id is id
*/
supplier:Supplier = Supplier.allInstance()->any(sup:Supplier | sup.Id = id)
precondition:
/*
The object supplier doesn't exists
*/
supplier.oclIsUndefined() = true
postcondition:
/*
The object sup of class Supplier was created
The attribute Id of object sup became id
The attribute Name of object sup became name
The all instance of class Supplier included object sup
The return value was true
*/
let sup:Supplier in
sup.oclIsNew() and
sup.Id = id and
sup.Name = name and
Supplier.allInstance()->includes(sup) and
result = true
}
```

<b>querySupplier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "querySupplier">querySupplier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>querySupplier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageSupplierCRUDService">ManageSupplierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Supplier</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>supplier represents the object of class <a href="#Supplier">Supplier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> supplier </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The return value was supplier</li></ol></td>
	</tr>		
</table>
<p>Contract of querySupplier:</p>

```java

Contract  ManageSupplierCRUDService::querySupplier(id : Integer) : Supplier {
definition:
/*
supplier represents the object of class Supplier whose attribute Id is id
*/
supplier:Supplier = Supplier.allInstance()->any(sup:Supplier | sup.Id = id)
precondition:
/*
The object supplier exists
*/
supplier.oclIsUndefined() = false
postcondition:
/*
The return value was supplier
*/
result = supplier
}
```

<b>modifySupplier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "modifySupplier">modifySupplier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>modifySupplier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageSupplierCRUDService">ManageSupplierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li><li>name, type: String</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>supplier represents the object of class <a href="#Supplier">Supplier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> supplier </i> exists</li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The attribute<i> Id </i> of object<i> supplier </i> became id </li><li> The attribute<i> Name </i> of object<i> supplier </i> became name </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of modifySupplier:</p>

```java

Contract  ManageSupplierCRUDService::modifySupplier(id : Integer, name : String) : Boolean {
definition:
/*
supplier represents the object of class Supplier whose attribute Id is id
*/
supplier:Supplier = Supplier.allInstance()->any(sup:Supplier | sup.Id = id)
precondition:
/*
The object supplier exists
*/
supplier.oclIsUndefined() = false
postcondition:
/*
The attribute Id of object supplier became id
The attribute Name of object supplier became name
The return value was true
*/
supplier.Id = id and
supplier.Name = name and
result = true
}
```

<b>deleteSupplier</b>
<table>
	<tr>
		<td><b>Operation Name:</b></td>
		<td><span name = "deleteSupplier">deleteSupplier</span></td>
	</tr>
	<tr>
		<td><b>Description:</b></td>
		<td>deleteSupplier is a system operation </td>
	</tr>
	<tr>
		<td><b>Service:</b></td>
		<td><a  href="#ManageSupplierCRUDService">ManageSupplierCRUDService</a></td>
	</tr>
	<tr>
		<td><b>Input:</b></td>
		<td><ol><li>id, type: Integer</li></ol></td>
	</tr>
	<tr>
		<td><b>Output Type:</b></td>
		<td>Boolean</td>
	</tr>
	<tr>
		<td><b>Definition:</b></td>
		<td><ol><li>supplier represents the object of class <a href="#Supplier">Supplier</a> whose attribute<i> Id </i> is id</li></ol></td>
	</tr>
	<tr>
		<td><b>Preconditions:</b></td>
		<td><ol><li>The object<i> supplier </i> exists </li><li> The all instance of class <a href="#Supplier">Supplier</a> includes object<i> supplier </i></li></ol></td>
	</tr>		
	<tr>
		<td><b>Postconditions:</b></td>
		<td><ol><li>The object<i> supplier </i> was deleted from all instance of class <a href="#Supplier">Supplier</a> </li><li> The return value was true</li></ol></td>
	</tr>		
</table>
<p>Contract of deleteSupplier:</p>

```java

Contract  ManageSupplierCRUDService::deleteSupplier(id : Integer) : Boolean {
definition:
/*
supplier represents the object of class Supplier whose attribute Id is id
*/
supplier:Supplier = Supplier.allInstance()->any(sup:Supplier | sup.Id = id)
precondition:
/*
The object supplier exists
The all instance of class Supplier includes object supplier
*/
supplier.oclIsUndefined() = false and
Supplier.allInstance()->includes(supplier)
postcondition:
/*
The object supplier was deleted from all instance of class Supplier
The return value was true
*/
Supplier.allInstance()->excludes(supplier) and
result = true
}
```



<h2>3.2  External interface requirements</h2>
<h3>3.2.1  User interfaces</h3>
<h3>3.2.2  Hardware interfaces</h3>
<h3>3.2.3  Software interfaces</h3>
<h3>3.2.4  Communications interfaces</h3>
<h2>3.3  Performance requirements</h2>
<h3>3.3.1  Static numerical requirements</h3>
This subsection should specify both the static and the dynamic numerical requirements placed on the software or on human interaction with the software as a whole. Static numerical requirements may include the following:

- a) The number of terminals to be supported;
- b) The number of simultaneous users to be supported;
- c) Amount and type of information to be handled.
<h3>3.3.2  Dynamic numerical requirements</h3>
Dynamic numerical requirements may include, for example, the numbers of transactions and tasks and the amount of data to be processed within certain time periods for both normal and peak workload conditions.

All of these requirements should be stated in measurable terms.

For example, 

- *95% of the transactions shall be processed in less than 1 s.*

rather than,

- *An operator shall not have to wait for the transaction to complete.*

NOTE:Numerical limits applied to one specifific function are normally specifified as part of the processing subparagraph description of that function. 

<h2>3.4  Design constraints</h2>
<h3>3.4.1  Standards compliance</h3>
This subsection should specify the requirements derived from existing standards or regulations. They may include the following:
		
- a) Report format;
- b) Data naming;
- c) Accounting procedures;
- d) Audit tracing.
		

For example, this could specify the requirement for software to trace processing activity. Such traces are needed for some applications to meet minimum regulatory or financial standards. An audit trace requirement may, for example, state that all changes to a payroll database must be recorded in a trace file with before and after values.
		
<h3>3.4.2  Hardware limitations</h3>
<h2>3.5  Software system attributes</h2>
<h3>3.5.1  Reliability</h3>
This should specify the factors required to establish the required reliability of the software system at time of delivery.
<h3>3.5.2  Availability</h3>
This should specify the factors required to guarantee a defined availability level for the entire system such as checkpoint, recovery, and restart.

<h3>3.5.3  Security</h3>
This should specify the factors that protect the software from accidental or malicious access, use, modification, destruction, or disclosure. Specific requirements in this area could include the need to

- a) Utilize certain cryptographical techniques;
- b) Keep specific log or history data sets;
- c) Assign certain functions to different modules;
- d) Restrict communications between some areas of the program;
- e) Check data integrity for critical variables.
<h3>3.5.4  Maintainability</h3>
This should specify attributes of software that relate to the ease of maintenance of the software itself. There may be some requirement for certain modularity, interfaces, complexity, etc. Requirements should not be placed here just because they are thought to be good design practices.

<h3>3.5.5  Portability</h3>
This should specify attributes of software that relate to the ease of porting the software to other host machines and/or operating systems. This may include the following:

- a) Percentage of components with host-dependent code;
- b) Percentage of code that is host dependent;
- c) Use of a proven portable language;
- d) Use of a particular compiler or language subset;
- e) Use of a particular operating system.
<h2>3.6  Other requirements</h2>
<h3>3.6.1  Logical database requirements</h3>
This should specify the logical requirements for any information that is to be placed into a database. This may include the following:

- a) Types of information used by various functions;
- b) Frequency of use;
- c) Accessing capabilities;
- d) Data entities and their relationships;
- e) Integrity constraints;
- f) Data retention requirements.
