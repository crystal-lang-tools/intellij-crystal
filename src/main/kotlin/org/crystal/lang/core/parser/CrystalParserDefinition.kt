package org.crystal.lang.core.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.crystal.lang.core.CrystalFileElementType
import org.crystal.lang.core.lexer.CrystalLexer
import org.crystal.lang.core.psi.CrystalCompositeElementTypes
import org.crystal.lang.core.psi.impl.CrystalFile

class CrystalParserDefinition : ParserDefinition {
    override fun createFile(viewProvider : FileViewProvider): PsiFile = CrystalFile(viewProvider)

    override fun getFileNodeType(): IFileElementType = CrystalFileElementType

    override fun createParser(project: Project?): PsiParser = CrystalParser()

    override fun createLexer(project: Project?): Lexer = CrystalLexer()

    override fun createElement(node: ASTNode?): PsiElement =
            CrystalCompositeElementTypes.Factory.createElement(node)

    override fun spaceExistanceTypeBetweenTokens(p0: ASTNode?, p1: ASTNode?): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    override fun getStringLiteralElements(): TokenSet = TokenSet.create(CrystalCompositeElementTypes.STRING)

    override fun getWhitespaceTokens(): TokenSet = TokenSet.create(TokenType.WHITE_SPACE)

    override fun getCommentTokens(): TokenSet = TokenSet.create(CrystalCompositeElementTypes.COMMENT)
}