package com.ekenyon

class BootStrap {

    def init = { servletContext ->

	def Manager1 = new
	Manager(
		fullName:'Steve Crossbar',
		userName:'scross',
		password:'secret2018',
		managerEmail:'scross@email.com',
		office:'B1-900',
		department:'Grocery').save()
	
	def Manager2 = new
	Manager(
		fullName:'Ella KEnyon',
		userName:'ekenyon',
		password:'password2018',
		managerEmail:'ekenyon@email.com',
		office:'B1-901',
		department:'Electronics').save()

	def teamLeader1 = new
	TeamLeader(	
		fullName:'Sarah Macdonald',
		department:'Grocery',
		employeeID:'TL1111',
		sectionName:'Bakery',
		officePhone:'011144555',
		leaderEmail:'smac@email.com',
		password:'secret2017').save()

	def teamLeader2 = new
	TeamLeader(	
		fullName:'Kieran Poole',
		department:'Clothing',
		employeeID:'TL1122',
		sectionName:'Butcher',
		officePhone:'011144556',
		leaderEmail:'kpoo@email.com',
		password:'password2017').save()

	def Employee1 = new
	Employee(
		fullName:'Tom Rivers',
		dateOfBirth:'05/05/1999',
		residence:'Sheffield',
		hourlyRate:'7.50',
		employeeID:'E2555',
		dateEmployed:'26/02/2018',
		taxCode:'TX345',
		contract:'Full-Time').save()

	def Employee2 = new
	Employee(
		fullName:'Lisa Collins',
		dateOfBirth:'06/06/1985',
		residence:'Sheffield',
		hourlyRate:'7.70',
		employeeID:'E2556',
		dateEmployed:'13/01/2017',
		taxCode:'TX346',
		contract:'Part-Time').save()

	def Team1 = new
	Team(
		teamName:'Team Loading',
		numberOfEmployees:'10',
		sectionName:'Bakery',
		description:'Loading and Unloading deliveries').save()

	def Team2 = new
	Team(
		teamName:'Team Loading',
		numberOfEmployees:'20',
		sectionName:'Butchers',
		description:'Loading and unloading deliveries').save()

	def Task1 = new
	Task(
		taskName:'Replenishing',
		numberOfPeople:'2',
		sectionName:'Bakery',
		department:'Grocery',
		timeRequired:'2 hours',
		description:'Replenishing shelves',
		taskCompleted:'true or false').save()

	def Task2 = new
	Task(	
		taskName:'Replenishing',
		numberOfPeople:'4',
		sectionName:'Bakery',
		department:'Grocery',
		timeRequired:'1 hour',
		description:'Replenishing shelves',
		taskCompleted:'true or false').save()

	def Shift1 = new
	Shift(
		timeOfDay:'Morning',
		dayOfWeek:'Monday',
		numberOfHours:'6',
		startingTime:'6:00am').save()

	def Shift2 = new
	Shift(
		timeOfDay:'Evening',
		dayOfWeek:'Tuesday',
		numberOfHours:'4',
		startingTime:'6:00pm').save()


    }
    def destroy = {
    }
}
