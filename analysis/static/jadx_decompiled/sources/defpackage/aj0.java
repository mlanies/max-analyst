package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class aj0 implements h78, i78 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public long o;

    public aj0(long j, long j2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = j;
                this.c = j2;
                this.o = j - 1;
                break;
            default:
                this.b = j;
                this.c = j2;
                this.o = j - 1;
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                long j = this.o;
                if (j < this.b || j > this.c) {
                    throw new NoSuchElementException();
                }
                return;
            default:
                long j2 = this.o;
                if (j2 < this.b || j2 > this.c) {
                    throw new NoSuchElementException();
                }
                return;
        }
    }

    @Override // defpackage.h78, defpackage.i78
    public final boolean next() {
        switch (this.a) {
            case 0:
                long j = this.o + 1;
                this.o = j;
                return !(j > this.c);
            default:
                long j2 = this.o + 1;
                this.o = j2;
                return !(j2 > this.c);
        }
    }
}
