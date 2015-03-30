import hudson.model.*;

JOB_NAME_DEPE="android_gui-api"
jobitems = jenkins.model.Jenkins.instance.getItem(JOB_NAME_DEPE).getDownstreamProjects()

int i=0;
for(hudson.model.Item item : jobitems) {
  
  
  
  
  print("[${++i}]"+item.name +" ------> ");
  
  if (item.getScm() instanceof hudson.plugins.git.GitSCM && !item.getScm().getRepositories().isEmpty()){
  for(org.eclipse.jgit.transport.RemoteConfig repo : item.getScm().getRepositories()){
   // println repo.getName()
    
    for (org.eclipse.jgit.transport.URIish url : repo.getURIs())
      println url.toString() ;
    }
    
    
    
  }
}