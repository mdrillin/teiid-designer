/* Generated By:JJTree: Do not edit this line. CompareCriteria.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.teiid.query.sql.symbol;

import org.teiid.designer.query.sql.symbol.IExpressionSymbol;
import org.teiid.query.parser.LanguageVisitor;
import org.teiid.query.parser.TeiidParser;
import org.teiid.query.sql.lang.SingleElementSymbol;

/**
 *
 */
@SuppressWarnings( "unused" )
public class ExpressionSymbol extends Symbol
    implements SingleElementSymbol, Expression, IExpressionSymbol<Expression, LanguageVisitor> {

    private Expression expression;

    /**
     * @param p
     * @param id
     */
    public ExpressionSymbol(TeiidParser p, int id) {
        super(p, id);
    }

    /**
     * Get the type of the symbol
     * @return Type of the symbol, may be null before resolution
     */
    @Override
    public Class getType() {
        return this.expression.getType();
    }

    /**
     * Get the expression for this symbol
     * @return Expression for this symbol
     */
    @Override
    public Expression getExpression() {
        return this.expression;
    }
    
    /**
     * Set the expression represented by this symbol.
     * @param expression Expression for this expression symbol
     */
    @Override
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((this.expression == null) ? 0 : this.expression.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        ExpressionSymbol other = (ExpressionSymbol)obj;
        if (this.expression == null) {
            if (other.expression != null) return false;
        } else if (!this.expression.equals(other.expression)) return false;
        return true;
    }

    /** Accept the visitor. **/
    @Override
    public void acceptVisitor(LanguageVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public ExpressionSymbol clone() {
        ExpressionSymbol clone = new ExpressionSymbol(this.parser, this.id);

        if(getExpression() != null)
            clone.setExpression(getExpression().clone());
        if(getShortCanonicalName() != null)
            clone.setShortCanonicalName(getShortCanonicalName());
        if(getOutputName() != null)
            clone.setOutputName(getOutputName());
        if(getShortName() != null)
            clone.setShortName(getShortName());
        if(getName() != null)
            clone.setName(getName());

        return clone;
    }

}
/* JavaCC - OriginalChecksum=b3e2979ada751b1aae0903db53c85d1c (do not edit this line) */
