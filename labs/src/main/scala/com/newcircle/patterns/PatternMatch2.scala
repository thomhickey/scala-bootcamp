package com.newcircle.patterns

object PatternMatch2 {

  sealed abstract class TreeNode
  case class ParentNode(val value: Any,
                        val left: TreeNode,
                        val right: TreeNode) extends TreeNode
  case class LeafNode(val value: Any) extends TreeNode

  def sumLeaves(root: TreeNode): Int = {
    0 // Replace this
  }

}
