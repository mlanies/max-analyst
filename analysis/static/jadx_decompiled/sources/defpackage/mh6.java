package defpackage;

/* loaded from: classes.dex */
public final class mh6 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    public final Object i;

    public /* synthetic */ mh6(int i, Object obj) {
        this.a = i;
        this.i = obj;
    }

    public final void a(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i3 = this.f;
                    int i4 = (i + 1) - i3;
                    if (i4 >= i2) {
                        this.f = (i2 - i) + i3;
                        break;
                    } else {
                        this.d = ((bArr[i4] & 192) >> 6) == 0;
                        this.c = false;
                        break;
                    }
                }
                break;
            default:
                if (this.c) {
                    int i5 = this.f;
                    int i6 = (i + 1) - i5;
                    if (i6 >= i2) {
                        this.f = (i2 - i) + i5;
                        break;
                    } else {
                        this.d = ((bArr[i6] & 192) >> 6) == 0;
                        this.c = false;
                        break;
                    }
                }
                break;
        }
    }

    public void b(int i, long j, boolean z) {
        fm9.k(this.h != -9223372036854775807L);
        if (this.e == 182 && z && this.b) {
            ((yze) this.i).a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
