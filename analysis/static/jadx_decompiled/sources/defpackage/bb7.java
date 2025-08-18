package defpackage;

import com.fasterxml.jackson.core.JsonParseException;

/* loaded from: classes.dex */
public final class bb7 extends fb7 {
    public final bb7 c;
    public final m5d d;
    public bb7 e;
    public String f;
    public int g;
    public int h;

    public bb7(bb7 bb7Var, m5d m5dVar, int i, int i2, int i3) {
        this.c = bb7Var;
        this.d = m5dVar;
        this.a = i;
        this.g = i2;
        this.h = i3;
        this.b = -1;
    }

    @Override // defpackage.fb7
    public final String a() {
        return this.f;
    }

    public final bb7 f(int i, int i2) {
        bb7 bb7Var = this.e;
        m5d m5dVar = null;
        if (bb7Var == null) {
            m5d m5dVar2 = this.d;
            if (m5dVar2 != null) {
                m5dVar = new m5d(8, m5dVar2.c);
            }
            bb7Var = new bb7(this, m5dVar, 1, i, i2);
            this.e = bb7Var;
        } else {
            bb7Var.a = 1;
            bb7Var.b = -1;
            bb7Var.g = i;
            bb7Var.h = i2;
            bb7Var.f = null;
            m5d m5dVar3 = bb7Var.d;
            if (m5dVar3 != null) {
                m5dVar3.b = null;
                m5dVar3.o = null;
                m5dVar3.X = null;
            }
        }
        return bb7Var;
    }

    public final bb7 g(int i, int i2) {
        bb7 bb7Var = this.e;
        m5d m5dVar = null;
        if (bb7Var == null) {
            m5d m5dVar2 = this.d;
            if (m5dVar2 != null) {
                m5dVar = new m5d(8, m5dVar2.c);
            }
            bb7 bb7Var2 = new bb7(this, m5dVar, 2, i, i2);
            this.e = bb7Var2;
            return bb7Var2;
        }
        bb7Var.a = 2;
        bb7Var.b = -1;
        bb7Var.g = i;
        bb7Var.h = i2;
        bb7Var.f = null;
        m5d m5dVar3 = bb7Var.d;
        if (m5dVar3 != null) {
            m5dVar3.b = null;
            m5dVar3.o = null;
            m5dVar3.X = null;
        }
        return bb7Var;
    }

    public final void h(String str) throws JsonParseException {
        this.f = str;
        m5d m5dVar = this.d;
        if (m5dVar == null || !m5dVar.F(str)) {
            return;
        }
        Object obj = m5dVar.c;
        throw new JsonParseException(obj instanceof ab7 ? (ab7) obj : null, zr6.i("Duplicate field '", str, "'"));
    }
}
