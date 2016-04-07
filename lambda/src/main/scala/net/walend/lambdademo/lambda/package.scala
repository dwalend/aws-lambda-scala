package net.walend.lambdademo

/**
  * Web API
  *
  * /user/ID/addEdge/ID POST - add a new relationship and post an edge . Body is some words about the relationship.
  * /users  GET - return a list of all users
  * /user/ID/edges GET - return a list of all user ID -> ID relationships
  * /user/ID/noEdge GET - return a list of all IDs with no relationship to the user
  * /edges GET - return a list of all relationships
  *
  * User lists are [{"name" : "yourName","id" : "3"} ...]
  *
  * Edges are {"from" : "3", "to" : "5" , "text" : "words" }
  *
  * and a list of edges is [ {"from" : "3", "to" : "5" , "text" : "words" } ... ]
  *
  *
  * 634303334930 - AWS account number
  *
  * https://634303334930.signin.aws.amazon.com/console/
  *
  * @author dwalend
  * @since v0.0.0
  */
package object lambda {

}
