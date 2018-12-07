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
			((Interface_RPCImpl)((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0)).notif();
			((Interface_Serveur_CompImpl)((Serveur_CompImpl)this.getServeur().get(0)).getInterface_serveur_comp().get(0)).notif();	
			((Serveur_ConfImpl)((Serveur_CompImpl)this.getServeur().get(0)).getServeur_conf().get(0)).notif();
			((Interface_Serveur_CompImpl)((Serveur_CompImpl)this.getServeur().get(0)).getInterface_serveur_comp().get(0)).notif();
			((Interface_RPCImpl)((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0)).notif();
			((Interface_ClientImpl)((ClientImpl)this.getClient().get(0)).getInterface_client().get(0)).notif();
		}
}
