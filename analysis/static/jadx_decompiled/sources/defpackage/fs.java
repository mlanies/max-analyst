package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class fs implements s7c {
    public static final Object o = new Object();
    public final String a;
    public final Class b;
    public final Object c;

    public fs(Class cls, Object obj, String str) {
        this.a = str;
        this.b = cls;
        this.c = obj;
    }

    @Override // defpackage.q7c
    public final /* bridge */ /* synthetic */ Object T0(Object obj, bc7 bc7Var) {
        return a((Widget) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x011a A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:8:0x001e, B:10:0x0026, B:12:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:22:0x004a, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0072, B:36:0x007a, B:38:0x0082, B:40:0x008a, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:50:0x00aa, B:52:0x00b2, B:54:0x00b8, B:55:0x00c6, B:57:0x00cf, B:59:0x00d5, B:61:0x00de, B:63:0x00f1, B:65:0x00f9, B:67:0x0103, B:69:0x0107, B:71:0x010b, B:76:0x0115, B:77:0x011a, B:79:0x0120, B:80:0x0129, B:82:0x012f, B:83:0x0138, B:85:0x013e, B:86:0x0147, B:88:0x014d, B:89:0x0156, B:90:0x015b, B:92:0x0161), top: B:96:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:8:0x001e, B:10:0x0026, B:12:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:22:0x004a, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0072, B:36:0x007a, B:38:0x0082, B:40:0x008a, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:50:0x00aa, B:52:0x00b2, B:54:0x00b8, B:55:0x00c6, B:57:0x00cf, B:59:0x00d5, B:61:0x00de, B:63:0x00f1, B:65:0x00f9, B:67:0x0103, B:69:0x0107, B:71:0x010b, B:76:0x0115, B:77:0x011a, B:79:0x0120, B:80:0x0129, B:82:0x012f, B:83:0x0138, B:85:0x013e, B:86:0x0147, B:88:0x014d, B:89:0x0156, B:90:0x015b, B:92:0x0161), top: B:96:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:8:0x001e, B:10:0x0026, B:12:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:22:0x004a, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0072, B:36:0x007a, B:38:0x0082, B:40:0x008a, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:50:0x00aa, B:52:0x00b2, B:54:0x00b8, B:55:0x00c6, B:57:0x00cf, B:59:0x00d5, B:61:0x00de, B:63:0x00f1, B:65:0x00f9, B:67:0x0103, B:69:0x0107, B:71:0x010b, B:76:0x0115, B:77:0x011a, B:79:0x0120, B:80:0x0129, B:82:0x012f, B:83:0x0138, B:85:0x013e, B:86:0x0147, B:88:0x014d, B:89:0x0156, B:90:0x015b, B:92:0x0161), top: B:96:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147 A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:8:0x001e, B:10:0x0026, B:12:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:22:0x004a, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0072, B:36:0x007a, B:38:0x0082, B:40:0x008a, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:50:0x00aa, B:52:0x00b2, B:54:0x00b8, B:55:0x00c6, B:57:0x00cf, B:59:0x00d5, B:61:0x00de, B:63:0x00f1, B:65:0x00f9, B:67:0x0103, B:69:0x0107, B:71:0x010b, B:76:0x0115, B:77:0x011a, B:79:0x0120, B:80:0x0129, B:82:0x012f, B:83:0x0138, B:85:0x013e, B:86:0x0147, B:88:0x014d, B:89:0x0156, B:90:0x015b, B:92:0x0161), top: B:96:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b A[Catch: all -> 0x0169, TryCatch #0 {all -> 0x0169, blocks: (B:8:0x001e, B:10:0x0026, B:12:0x002e, B:15:0x0036, B:17:0x003c, B:19:0x0042, B:22:0x004a, B:24:0x0052, B:26:0x005a, B:29:0x0062, B:31:0x006a, B:33:0x0072, B:36:0x007a, B:38:0x0082, B:40:0x008a, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:50:0x00aa, B:52:0x00b2, B:54:0x00b8, B:55:0x00c6, B:57:0x00cf, B:59:0x00d5, B:61:0x00de, B:63:0x00f1, B:65:0x00f9, B:67:0x0103, B:69:0x0107, B:71:0x010b, B:76:0x0115, B:77:0x011a, B:79:0x0120, B:80:0x0129, B:82:0x012f, B:83:0x0138, B:85:0x013e, B:86:0x0147, B:88:0x014d, B:89:0x0156, B:90:0x015b, B:92:0x0161), top: B:96:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(one.me.sdk.arch.Widget r7) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs.a(one.me.sdk.arch.Widget):java.lang.Object");
    }

    public final void b(Widget widget, Object obj) {
        Bundle args = widget.getArgs();
        String str = this.a;
        if (obj == null) {
            args.remove(str);
            return;
        }
        Class cls = this.b;
        if (!tpa.f(cls, Boolean.class)) {
            Class cls2 = Boolean.TYPE;
            if (!tpa.f(cls, cls2) && !tpa.f(cls, cls2)) {
                if (tpa.f(cls, boolean[].class)) {
                    args.putBooleanArray(str, (boolean[]) obj);
                    return;
                }
                if (!tpa.f(cls, Character.class)) {
                    Class cls3 = Character.TYPE;
                    if (!tpa.f(cls, cls3) && !tpa.f(cls, cls3)) {
                        if (tpa.f(cls, char[].class)) {
                            args.putCharArray(str, (char[]) obj);
                            return;
                        }
                        if (tpa.f(cls, CharSequence.class)) {
                            args.putCharSequence(str, (CharSequence) obj);
                            return;
                        }
                        if (tpa.f(cls, CharSequence[].class)) {
                            args.putCharSequenceArray(str, (CharSequence[]) obj);
                            return;
                        }
                        if (tpa.f(cls, String.class) || tpa.f(cls, null) || tpa.f(cls, String.class)) {
                            args.putString(str, (String) obj);
                            return;
                        }
                        if (tpa.f(cls, String[].class)) {
                            args.putStringArray(str, (String[]) obj);
                            return;
                        }
                        if (!tpa.f(cls, Integer.class)) {
                            Class cls4 = Integer.TYPE;
                            if (!tpa.f(cls, cls4) && !tpa.f(cls, cls4)) {
                                if (tpa.f(cls, int[].class)) {
                                    args.putIntArray(str, (int[]) obj);
                                    return;
                                }
                                if (!tpa.f(cls, Long.class)) {
                                    Class cls5 = Long.TYPE;
                                    if (!tpa.f(cls, cls5) && !tpa.f(cls, cls5)) {
                                        if (tpa.f(cls, long[].class)) {
                                            args.putLongArray(str, (long[]) obj);
                                            return;
                                        }
                                        if (!tpa.f(cls, Float.class)) {
                                            Class cls6 = Float.TYPE;
                                            if (!tpa.f(cls, cls6) && !tpa.f(cls, cls6)) {
                                                if (tpa.f(cls, float[].class)) {
                                                    args.putFloatArray(str, (float[]) obj);
                                                    return;
                                                }
                                                if (!tpa.f(cls, Double.class)) {
                                                    Class cls7 = Double.TYPE;
                                                    if (!tpa.f(cls, cls7) && !tpa.f(cls, cls7)) {
                                                        if (tpa.f(cls, double[].class)) {
                                                            args.putDoubleArray(str, (double[]) obj);
                                                            return;
                                                        }
                                                        if (!tpa.f(cls, Short.class)) {
                                                            Class cls8 = Short.TYPE;
                                                            if (!tpa.f(cls, cls8) && !tpa.f(cls, cls8)) {
                                                                if (tpa.f(cls, short[].class)) {
                                                                    args.putShortArray(str, (short[]) obj);
                                                                    return;
                                                                }
                                                                if (!tpa.f(cls, Byte.class)) {
                                                                    Class cls9 = Byte.TYPE;
                                                                    if (!tpa.f(cls, cls9) && !tpa.f(cls, cls9)) {
                                                                        if (tpa.f(cls, byte[].class)) {
                                                                            args.putByteArray(str, (byte[]) obj);
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, Parcelable[].class)) {
                                                                            args.putParcelableArray(str, (Parcelable[]) obj);
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, Bundle.class)) {
                                                                            args.putBundle(str, (Bundle) obj);
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, Size.class)) {
                                                                            args.putSize(str, (Size) obj);
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, SizeF.class)) {
                                                                            args.putSizeF(str, (SizeF) obj);
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, ArrayList.class)) {
                                                                            ArrayList<Integer> arrayList = (ArrayList) obj;
                                                                            if (!arrayList.isEmpty()) {
                                                                                Object objG0 = x53.g0(arrayList);
                                                                                if (objG0 instanceof String) {
                                                                                    args.putStringArrayList(str, arrayList);
                                                                                    return;
                                                                                }
                                                                                if (objG0 instanceof Parcelable) {
                                                                                    args.putParcelableArrayList(str, arrayList);
                                                                                    return;
                                                                                } else if (objG0 instanceof CharSequence) {
                                                                                    args.putCharSequenceArrayList(str, arrayList);
                                                                                    return;
                                                                                } else {
                                                                                    if (!(objG0 instanceof Integer)) {
                                                                                        throw new UnsupportedOperationException(String.format("ArrayList with type of `%s` is not supported!", Arrays.copyOf(new Object[]{x53.g0(arrayList).getClass()}, 1)));
                                                                                    }
                                                                                    args.putIntegerArrayList(str, arrayList);
                                                                                    return;
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (tpa.f(cls, SparseArray.class)) {
                                                                            SparseArray<? extends Parcelable> sparseArray = (SparseArray) obj;
                                                                            if (sparseArray.size() != 0) {
                                                                                Parcelable parcelableValueAt = sparseArray.valueAt(0);
                                                                                if (!(parcelableValueAt instanceof Parcelable)) {
                                                                                    throw new UnsupportedOperationException(String.format("SparseArray with type of `%s` is not supported!", Arrays.copyOf(new Object[]{parcelableValueAt.getClass()}, 1)));
                                                                                }
                                                                                args.putSparseParcelableArray(str, sparseArray);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        if (IBinder.class.isAssignableFrom(cls)) {
                                                                            args.putBinder(str, (IBinder) obj);
                                                                            return;
                                                                        } else if (Parcelable.class.isAssignableFrom(cls)) {
                                                                            args.putParcelable(str, (Parcelable) obj);
                                                                            return;
                                                                        } else {
                                                                            if (!Serializable.class.isAssignableFrom(cls)) {
                                                                                throw new UnsupportedOperationException(String.format("Value of `%s` type is not supported", Arrays.copyOf(new Object[]{cls}, 1)));
                                                                            }
                                                                            args.putSerializable(str, (Serializable) obj);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                args.putByte(str, ((Byte) obj).byteValue());
                                                                return;
                                                            }
                                                        }
                                                        args.putShort(str, ((Short) obj).shortValue());
                                                        return;
                                                    }
                                                }
                                                args.putDouble(str, ((Double) obj).doubleValue());
                                                return;
                                            }
                                        }
                                        args.putFloat(str, ((Float) obj).floatValue());
                                        return;
                                    }
                                }
                                args.putLong(str, ((Long) obj).longValue());
                                return;
                            }
                        }
                        args.putInt(str, ((Integer) obj).intValue());
                        return;
                    }
                }
                args.putChar(str, ((Character) obj).charValue());
                return;
            }
        }
        args.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    @Override // defpackage.s7c
    public final /* bridge */ /* synthetic */ void o1(Object obj, bc7 bc7Var, Object obj2) {
        b((Widget) obj, obj2);
    }

    public /* synthetic */ fs(Class cls, String str) {
        this(cls, o, str);
    }
}
