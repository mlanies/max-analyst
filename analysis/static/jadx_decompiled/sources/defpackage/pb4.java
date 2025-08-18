package defpackage;

/* loaded from: classes.dex */
public final class pb4 implements nu6 {
    public static final byte[] b = {-1, -40, -1};
    public static final int c = 3;
    public static final byte[] d = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final int e = 8;
    public static final byte[] f = c54.e("GIF87a");
    public static final byte[] g = c54.e("GIF89a");
    public static final byte[] h;
    public static final int i;
    public static final byte[] j;
    public static final int k;
    public static final byte[] l;
    public static final byte[][] m;
    public static final byte[] n;
    public static final byte[] o;
    public static final int p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public final int a;

    static {
        byte[] bArrE = c54.e("BM");
        h = bArrE;
        i = bArrE.length;
        j = new byte[]{0, 0, 1, 0};
        k = 4;
        l = c54.e("ftyp");
        m = new byte[][]{c54.e("heic"), c54.e("heix"), c54.e("hevc"), c54.e("hevx"), c54.e("mif1"), c54.e("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
        p = 4;
        q = new byte[]{3, 0, 8, 0};
        r = c54.e("ftyp");
        s = c54.e("avif");
    }

    public pb4() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(c), Integer.valueOf(e), 6, Integer.valueOf(i), Integer.valueOf(k), 12, 4, 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            int i2 = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num3 = numArr[i2];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    @Override // defpackage.nu6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ou6 a(int r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb4.a(int, byte[]):ou6");
    }

    @Override // defpackage.nu6
    public final int b() {
        return this.a;
    }
}
