package io.unthrottled.doki.icons.jetbrains.tree

import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiElement

class VirtualFileInfo(
  val psiElement: PsiElement,
  private val virtualFile: VirtualFile,
) {
  val name: String?
    get() = virtualFile.name

  val fileType: String?
    get() = virtualFile.fileType.name
}
