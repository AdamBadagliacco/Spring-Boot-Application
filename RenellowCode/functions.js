/*eslint-env browser*/

function quickDice(){ // eslint-disable-line no-unused-vars
    var x = document.forms["quickD"]["quickDinput"].value;
    var i = x.indexOf('d');
    
    if(i!=-1){
         var numDice = x.substring(0,i);                 
    var typeDice = x.substring(i+1);
    var writeout = x + ': <br>';
    var total = 0;                
    for (i = 0; i < numDice; i++) {     
        var c = (Math.floor(Math.random()*typeDice)+1);
        total += c;
        if(i!=(numDice-1)){
            writeout += " " + c + ", ";
         } else {
            writeout += " " + c;                             
             }    
        }
    
        document.getElementById("displayQuickDice").innerHTML = writeout + '<br>total: ' + total;
        document.getElementById("displayDiceH").innerHTML = writeout + '<br>total: ' + total +'<br>' +     document.getElementById("displayDiceH").innerHTML;
    } else {
        document.getElementById("displayQuickDice").innerHTML = "<br>Input in format #dice d #sizeDice, e.g. 2d10";
    }
    
                       
}

function rollDiceV(a,b){ // eslint-disable-line no-unused-vars
    var x = (Math.floor(Math.random()*a)+1)*b;
    document.getElementById("displayDiceV").innerHTML = '1d'+ a + ': ' + x;
    document.getElementById("displayDiceH").innerHTML = '1d'+ a + ': ' + x + '<br>' + document.getElementById("displayDiceH").innerHTML;
}

function clearDiceH(){ // eslint-disable-line no-unused-vars
    document.getElementById("displayDiceH").innerHTML = "";
}


        
        /*
    Default constructor configuration:
        autoplay: false,
        shuffle: false,
        loop: false,
        playerId: "audioPlayer",
        playlistId: "playlist",
        currentClass: "current-song"
        */
        
        // loads the audio player
        
        var elB = document.getElementsByClassName("Blist");
          
          for(var i = 0; i < elB.length; i++) { 
              elB[i].onclick = function(){ // eslint-disable-line no-unused-vars
                  var configB = {
                  autoplay: true, 
                   loop: true,
                    playerId:"audioPlayerB",
                    playlistId: "playlistB"
                  };
                  var playlist = new AudioPlaylist(configB);  
                  return false;
              }
          }
        
        var elE = document.getElementsByClassName("Elist");
          
          for(i = 0; i < elE.length; i++) {
              elE[i].onclick = function(){ // eslint-disable-line no-unused-vars
                  var configE = {
                  autoplay: false, 
                   loop: false,
                      playerId:"audioPlayerE",
                    playlistId: "playlistE"
                  };
               var playlist = new AudioPlaylist(configE); 
                  return false;
              }
          }
        
        var elSE = document.getElementsByClassName("SElist");
          
          for(i = 0; i < elSE.length; i++) {
              elSE[i].onclick = function(){ // eslint-disable-line no-unused-vars
                  var configSE = {
                  autoplay: false, 
                   loop: false,
                      playerId:"audioPlayerSE",
                    playlistId: "playlistSE"
                  };
               var playlist = new AudioPlaylist(configSE); 
                  return false;
              }
          }