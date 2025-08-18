package defpackage;

/* loaded from: classes.dex */
public abstract class fb7 {
    public int a;
    public int b;

    public abstract String a();

    public final boolean b() {
        return this.a == 1;
    }

    public final boolean c() {
        return this.a == 2;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final String e() {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                sb.append('{');
                String strA = a();
                if (strA != null) {
                    sb.append('\"');
                    int[] iArr = w42.h;
                    int length = iArr.length;
                    int length2 = strA.length();
                    while (i < length2) {
                        char cCharAt = strA.charAt(i);
                        if (cCharAt >= length || iArr[cCharAt] == 0) {
                            sb.append(cCharAt);
                        } else {
                            sb.append('\\');
                            int i2 = iArr[cCharAt];
                            if (i2 < 0) {
                                sb.append("u00");
                                char[] cArr = w42.a;
                                sb.append(cArr[cCharAt >> 4]);
                                sb.append(cArr[cCharAt & 15]);
                            } else {
                                sb.append((char) i2);
                            }
                        }
                        i++;
                    }
                    sb.append('\"');
                } else {
                    sb.append('?');
                }
                sb.append('}');
            } else {
                sb.append('[');
                int i3 = this.b;
                sb.append(i3 >= 0 ? i3 : 0);
                sb.append(']');
            }
        } else {
            sb.append("/");
        }
        return sb.toString();
    }
}
