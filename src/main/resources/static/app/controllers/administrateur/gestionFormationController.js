var myApp = angular.module("GestionFormation");
myApp.controller("gestionFormationController", function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.formation = 
    {
        nomFormation : "",
        Description: "",
        dateFormation: "",
        responsableFormation: 
        {
            responsable:{idUtilisateur: null}
        },
        collaborateurs : null,
       
        sessionFormations : null
    };
    
    //données a fournir au formulaire de la BD
    //$scope.optionsUtilisateurs = [];
    
    //choix fait
    $scope.choixFormateurs = null;
    
    
    
    $scope.testFunc= function()
    {
        
    };
    
    $scope.getUtilisateurs = function()
    {
         $http.get("/utilisateurs/list")
                .success(function(data)
                {
                    $scope.optionsUtilisateurs = data;
                    
                });
    };
    
    $scope.valider = function()
    {
       $scope.formation.collaborateurs = $scope.arrayIdUsers($scope.formation.collaborateurs);
       
        
        $http
        ({
            method : 'post',
            url : "/formations/creer",
            data : $scope.formation,
            headers : {'Content-Type' : 'application/json'}
            
        });

        console.log($scope.formation);
    };
    
    $scope.arrayIdUsers = function(p)
    {
        var result = [];
        for (i = 0; i < p.length; i++) 
        { 
            result[i] = {collaborateur:{idUtilisateur:parseInt(p[i])}};
        }
        return result;
    };
    
    $scope.getUtilisateurs();
});