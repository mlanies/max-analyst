package defpackage;

/* loaded from: classes2.dex */
public enum mg4 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);

    public static final xxc o = new xxc();
    public final byte a;
    public final khe b;
    public final khe c;

    mg4(byte b) {
        this.a = b;
        final int i = 0;
        this.b = new khe(new k56(this) { // from class: lg4
            public final /* synthetic */ mg4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(this.b == mg4.REGULAR);
                    default:
                        return Boolean.valueOf(this.b == mg4.DELAYED);
                }
            }
        });
        final int i2 = 1;
        this.c = new khe(new k56(this) { // from class: lg4
            public final /* synthetic */ mg4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(this.b == mg4.REGULAR);
                    default:
                        return Boolean.valueOf(this.b == mg4.DELAYED);
                }
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
