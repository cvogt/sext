package sext

import embrace._

object Arguments {
  def parse
    [ Z ]
    ( args     : Array[String], 
      defaults : Seq[String], 
      process  : Array[String] => Z ) 
    : Z
    = if( args.length <= defaults.length )
        (args ++ defaults.drop(args.length)) $ process
      else 
        throw new Exception("Too many args")


}