package modbat.test

import modbat.dsl._

//setWeight should set weights of all transitions with same label
class SetWeight3 extends Model {
  "init" -> "left" := {
    setWeight("roundtrip", 1)
  } label "loop"

  "left" -> "right" := {
  } label "roundtrip" weight 0

  "right" -> "left" := {
    setWeight("roundtrip",0)
  } label "roundtrip" weight 0
}

