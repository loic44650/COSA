package com.cosa;

import client_serveur.impl.Client_serveurImpl;
import client_serveur.*;
import client_serveur.impl.Client_serveurFactoryImpl;

public class ClientServeurApp extends Client_serveurImpl{

	public static void main(String[] args) {

		
		Client_serveurFactoryImpl csf = (Client_serveurFactoryImpl) Client_serveurFactoryImpl.init();
		
		//Client
		// ClientImpl client = (ClientImpl) csf.createClient();
		Client client = csf.createClient();
		Interface_Client ic = csf.createInterface_Client();
		Port_Fourni_Client pfc = csf.createPort_Fourni_Client();
		Port_Requis_Client prc = csf.createPort_Requis_Client();
		ic.getPort_fourni_client().add(pfc);
		ic.getPort_requis_client().add(prc);
		client.getInterface_client().add(ic);
		
		//RPC
		RPC rpc = csf.createRPC();
		Interface_RPC irpc = csf.createInterface_RPC();
		Role_Fourni_RPC_Client rfrpcc = csf.createRole_Fourni_RPC_Client();
		Role_Requis_RPC_Client rrrpcc = csf.createRole_Requis_RPC_Client();
		Role_Fourni_RPC_Serveur rfrpcs = csf.createRole_Fourni_RPC_Serveur();
		Role_Requis_RPC_Serveur rrrpcs = csf.createRole_Requis_RPC_Serveur();
		irpc.getRole_fourni_rpc_client().add(rfrpcc);
		irpc.getRole_requis_rpc_client().add(rrrpcc);
		irpc.getRole_fourni_rpc_serveur().add(rfrpcs);
		irpc.getRole_requis_rpc_serveur().add(rrrpcs);
		rpc.getInterface_rpc().add(irpc);
		
		//Server
		Serveur_Comp serveur = csf.createServeur_Comp();
		Interface_Serveur_Comp is = csf.createInterface_Serveur_Comp();
		Port_Fourni_Serveur pfs = csf.createPort_Fourni_Serveur();
		Port_Requis_Serveur prs = csf.createPort_Requis_Serveur();
		is.getPort_fourni_serveur().add(pfs);
		is.getPort_requis_serveur().add(prs);
		serveur.getInterface_serveur_comp().add(is);
		
		//Client Serveur
		Client_serveur clientServeur = csf.createClient_serveur();
		clientServeur.getClient().add(client);
		clientServeur.getServeur().add(serveur);
		clientServeur.getRpc().add(rpc);
		
		//Attachments Client-->RPC
		Attachment_Client_RPC acrpc = csf.createAttachment_Client_RPC();
		client.getInterface_client().get(0).getPort_fourni_client().get(0).setAttachment_client_rpc(acrpc);
		rpc.getInterface_rpc().get(0).getRole_requis_rpc_client().get(0).setAttachment_client_rpc(acrpc);
		
		//Attachments RPC-->Client
		Attachment_RPC_Client arpcc = csf.createAttachment_RPC_Client();
		client.getInterface_client().get(0).getPort_requis_client().get(0).setAttachment_rpc_client(arpcc);
		rpc.getInterface_rpc().get(0).getRole_fourni_rpc_client().get(0).setAttachment_rpc_client(arpcc);
		
		//Attachments Serveur-->RPC
		Attachment_Serveur_RPC asrpc = csf.createAttachment_Serveur_RPC();
		serveur.getInterface_serveur_comp().get(0).getPort_fourni_serveur().get(0).setAttachment_serveur_rpc(asrpc);
		rpc.getInterface_rpc().get(0).getRole_requis_rpc_serveur().get(0).setAttachment_serveur_rpc(asrpc);
		
		//Attachments RPC-->Serveur
		Attachment_RPC_Serveur arpcs = csf.createAttachment_RPC_Serveur();
		serveur.getInterface_serveur_comp().get(0).getPort_requis_serveur().get(0).setAttachment_rpc_serveur(arpcs);
		rpc.getInterface_rpc().get(0).getRole_fourni_rpc_serveur().get(0).setAttachment_rpc_serveur(arpcs);
		
		
	}
	
}
