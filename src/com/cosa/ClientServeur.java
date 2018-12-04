package com.cosa;

import client_serveur.impl.ClientImpl;
import client_serveur.impl.Client_serveurImpl;
import client_serveur.impl.RPCImpl;
import client_serveur.impl.Serveur_CompImpl;

public class ClientServeur extends Client_serveurImpl{
		public ClientServeur() {
			
		}
		public void run() {
			((ClientImpl)this.getClient().get(0)).sendRequest("HELLO WORLD!");
			this.update();
		}
		
		public void update() {
			((ClientImpl)this.getClient().get(0)).getInterface_client().get(0).getPort_requis_client().get(0).update();
			((Serveur_CompImpl)this.getServeur().get(0)).getInterface_serveur_comp().get(0).getPort_requis_serveur().get(0).update();
			((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0).getRole_requis_rpc_client().get(0).update();
			((RPCImpl)this.getRpc().get(0)).getInterface_rpc().get(0).getRole_requis_rpc_serveur().get(0).update();
		}
}
