package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class t99 {
    public final m99 a;
    public final char[] b;
    public final s99 c = new s99(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    public final Typeface d;

    public t99(Typeface typeface, m99 m99Var) {
        int i;
        int i2;
        this.d = typeface;
        this.a = m99Var;
        int iA = m99Var.a(6);
        if (iA != 0) {
            int i3 = iA + m99Var.a;
            i = ((ByteBuffer) m99Var.o).getInt(((ByteBuffer) m99Var.o).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int iA2 = m99Var.a(6);
        if (iA2 != 0) {
            int i4 = iA2 + m99Var.a;
            i2 = ((ByteBuffer) m99Var.o).getInt(((ByteBuffer) m99Var.o).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            b4f b4fVar = new b4f(this, i5);
            l99 l99VarC = b4fVar.c();
            int iA3 = l99VarC.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) l99VarC.o).getInt(iA3 + l99VarC.a) : 0, this.b, i5 * 2);
            c54.j("invalid metadata codepoint length", b4fVar.b() > 0);
            this.c.a(b4fVar, 0, b4fVar.b() - 1);
        }
    }
}
