package com.cosa;

import client_serveur.impl.ClientImpl;
import client_serveur.impl.Client_serveurImpl;
import client_serveur.impl.Interface_ClientImpl;
import client_serveur.impl.Interface_RPCImpl;
import client_serveur.impl.Interface_Serveur_CompImpl;
import client_serveur.impl.RPCImpl;
import client_serveur.impl.Serveur_CompImpl;
import client_serveur.impl.Serveur_ConfImpl;

public class ClientServeur extends Client_serveurImpl
{
		public ClientServeur() {}
		
		public void run() 
		{
			((ClientImpl)this.getClient().get(0)).sendRequest("Quel est la valeurs actuellement stocker dans la database ?");
			this.update();			
		}
		
		public void update() 
		{
			System.out.println("Notify Interface_RPCImpl");
			((Interface_RPCImpl)((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0)).notif();
			System.out.println("Notify Interface_ServeurComp");
			((Interface_Serveur_CompImpl)((Serveur_CompImpl)this.getServeur().get(0)).getInterface_serveur_comp().get(0)).notif();	
			System.out.println("Notify Serveur_ConfImpl");
			((Serveur_ConfImpl)((Serveur_CompImpl)this.getServeur().get(0)).getServeur_conf().get(0)).notif();
			System.out.println("Notify Interface_Serveur_Comp");
			((Interface_Serveur_CompImpl)((Serveur_CompImpl)this.getServeur().get(0)).getInterface_serveur_comp().get(0)).notif();
			System.out.println("Notify Interface_RPCImpl");
			((Interface_RPCImpl)((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0)).notif();
			System.out.println("Notify Interface_ClientImpl");
			((Interface_ClientImpl)((ClientImpl)this.getClient().get(0)).getInterface_client().get(0)).notif();
		}
}
