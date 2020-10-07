#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Client
#------------------------------------------------------------

CREATE TABLE Client(
        IdClient             Int  Auto_increment  NOT NULL ,
        Nom                  Varchar (50) NOT NULL ,
        Prenom               Varchar (50) NOT NULL ,
        Email                Varchar (100) NOT NULL ,
        adresse              Varchar (100) NOT NULL ,
        Information_bancaire Varchar (100) NOT NULL ,
        CodePostal           Int NOT NULL ,
        Capital              Int NOT NULL ,
        Telephone            Int NOT NULL
	,CONSTRAINT Client_PK PRIMARY KEY (IdClient)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Voiture
#------------------------------------------------------------

CREATE TABLE Voiture(
        IdVoiture        Int  Auto_increment  NOT NULL ,
        Annee            Date NOT NULL ,
        Marque           Varchar (100) NOT NULL ,
        Modele           Varchar (50) NOT NULL ,
        Couleur          Varchar (50) NOT NULL ,
        Carburant        Varchar (50) NOT NULL ,
        Energie          Varchar (100) NOT NULL ,
        Boite_de_vitesse Varchar (100) NOT NULL ,
        EtatVoiture      Varchar (100) NOT NULL ,
        Description      Varchar (50) NOT NULL ,
        Nbporte          Int NOT NULL ,
        NbChevaux        Int NOT NULL ,
        NbKilometre      Int NOT NULL
	,CONSTRAINT Voiture_PK PRIMARY KEY (IdVoiture)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Assurance
#------------------------------------------------------------

CREATE TABLE Assurance(
        IdAssurance      Int  Auto_increment  NOT NULL ,
        LibelleAssurance Varchar (250) NOT NULL ,
        Prix             Int NOT NULL
	,CONSTRAINT Assurance_PK PRIMARY KEY (IdAssurance)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Reprise
#------------------------------------------------------------

CREATE TABLE Reprise(
        IdReprise      Int  Auto_increment  NOT NULL ,
        Description    Varchar (250) NOT NULL ,
        TauxDepriecie  Int NOT NULL
	,CONSTRAINT Reprise_PK PRIMARY KEY (IdReprise)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: voiture acquise
#------------------------------------------------------------

CREATE TABLE voiture_acquise(
        IdVoitureAcquise Int  Auto_increment  NOT NULL ,
        DateAcquisition  Date NOT NULL ,
        IdVoiture        Int NOT NULL ,
        IdClient         Int NOT NULL ,
        IdAssurance      Int NOT NULL ,
        IdReprise        Int
	,CONSTRAINT voiture_acquise_PK PRIMARY KEY (IdVoitureAcquise)

	,CONSTRAINT voiture_acquise_Voiture_FK FOREIGN KEY (IdVoiture) REFERENCES Voiture(IdVoiture)
	,CONSTRAINT voiture_acquise_Client0_FK FOREIGN KEY (IdClient) REFERENCES Client(IdClient)
	,CONSTRAINT voiture_acquise_Assurance1_FK FOREIGN KEY (IdAssurance) REFERENCES Assurance(IdAssurance)
	,CONSTRAINT voiture_acquise_Reprise2_FK FOREIGN KEY (IdReprise) REFERENCES Reprise(IdReprise)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Reparation
#------------------------------------------------------------

CREATE TABLE Reparation(
        IdReparation     Int  Auto_increment  NOT NULL ,
        TypeReparation   Varchar (250) NOT NULL ,
        Prix             Int NOT NULL ,
        IdVoitureAcquise Int NOT NULL
	,CONSTRAINT Reparation_PK PRIMARY KEY (IdReparation)

	,CONSTRAINT Reparation_voiture_acquise_FK FOREIGN KEY (IdVoitureAcquise) REFERENCES voiture_acquise(IdVoitureAcquise)
)ENGINE=InnoDB;

