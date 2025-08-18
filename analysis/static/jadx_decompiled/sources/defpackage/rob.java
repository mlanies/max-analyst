package defpackage;

import com.google.firebase.encoders.EncodingException;

/* loaded from: classes.dex */
public final class rob implements xaf {
    public boolean a = false;
    public boolean b = false;
    public kf5 c;
    public final qob d;

    public rob(qob qobVar) {
        this.d = qobVar;
    }

    @Override // defpackage.xaf
    public final xaf b(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.xaf
    public final xaf c(boolean z) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
