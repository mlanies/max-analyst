package defpackage;

import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class te implements qj3 {
    public static final lh4 Y = new lh4();
    public final Object X;
    public final boolean a;
    public final Object b;
    public Object c;
    public Object o;

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.a = z;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        c4f[] c4fVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c4fVarArr = (c4f[]) editable.getSpans(selectionStart, selectionEnd, c4f.class)) != null && c4fVarArr.length > 0) {
            for (c4f c4fVar : c4fVarArr) {
                int spanStart = editable.getSpanStart(c4fVar);
                int spanEnd = editable.getSpanEnd(c4fVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        if (charSequence.length() == 0 || charSequence.equals((CharSequence) this.b)) {
            return;
        }
        ((k29) this.c).a((e52) this.o, (es8) this.X, charSequence, this.a);
    }

    public boolean b(CharSequence charSequence, int i, int i2, b4f b4fVar) {
        if ((b4fVar.c & 3) == 0) {
            sw4 sw4Var = (sw4) this.o;
            l99 l99VarC = b4fVar.c();
            int iA = l99VarC.a(8);
            if (iA != 0) {
                ((ByteBuffer) l99VarC.o).getShort(iA + l99VarC.a);
            }
            ya4 ya4Var = (ya4) sw4Var;
            ya4Var.getClass();
            ThreadLocal threadLocal = ya4.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ya4Var.a;
            String string = sb.toString();
            int i3 = jpa.a;
            boolean zA = ipa.a(textPaint, string);
            int i4 = b4fVar.c & 4;
            b4fVar.c = zA ? i4 | 2 : i4 | 1;
        }
        return (b4fVar.c & 3) == 2;
    }

    public Object c(CharSequence charSequence, int i, int i2, int i3, boolean z, xx4 xx4Var) {
        int i4;
        char c;
        zx4 zx4Var = new zx4(((t99) this.c).c, this.a, (int[]) this.X);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        boolean zK = true;
        int i5 = 0;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zK) {
                SparseArray sparseArray = zx4Var.c.a;
                s99 s99Var = sparseArray == null ? null : (s99) sparseArray.get(iCodePointAt);
                if (zx4Var.a == 2) {
                    if (s99Var != null) {
                        zx4Var.c = s99Var;
                        zx4Var.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            zx4Var.a();
                        } else if (iCodePointAt != 65039) {
                            s99 s99Var2 = zx4Var.c;
                            if (s99Var2.b != null) {
                                if (zx4Var.f != 1) {
                                    zx4Var.d = s99Var2;
                                    zx4Var.a();
                                } else if (zx4Var.b()) {
                                    zx4Var.d = zx4Var.c;
                                    zx4Var.a();
                                } else {
                                    zx4Var.a();
                                }
                                c = 3;
                            } else {
                                zx4Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (s99Var == null) {
                    zx4Var.a();
                    c = 1;
                } else {
                    zx4Var.a = 2;
                    zx4Var.c = s99Var;
                    zx4Var.f = 1;
                    c = 2;
                }
                zx4Var.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !b(charSequence, i4, iCharCount, zx4Var.d.b)) {
                        zK = xx4Var.k(charSequence, i4, iCharCount, zx4Var.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (zx4Var.a == 2 && zx4Var.c.b != null && ((zx4Var.f > 1 || zx4Var.b()) && i5 < i3 && zK && (z || !b(charSequence, i4, iCharCount, zx4Var.c.b)))) {
            xx4Var.k(charSequence, i4, iCharCount, zx4Var.c.b);
        }
        return xx4Var.h();
    }

    public boolean d(Bitmap bitmap, int i) {
        try {
            ((w36) this.o).v(bitmap, i);
            return true;
        } catch (IllegalStateException e) {
            if (!ta5.a.i(6)) {
                return false;
            }
            ta5.a.e(te.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    public te(wn0 wn0Var, ue ueVar, boolean z) {
        this.b = wn0Var;
        this.c = ueVar;
        this.a = z;
        fd7 fd7Var = new fd7(this);
        this.X = fd7Var;
        this.o = new w36(ueVar, z, fd7Var);
    }

    public te(t99 t99Var, kj6 kj6Var, sw4 sw4Var, boolean z, int[] iArr, Set set) {
        this.b = kj6Var;
        this.c = t99Var;
        this.o = sw4Var;
        this.a = z;
        this.X = iArr;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) it.next();
            String str = new String(iArr2, 0, iArr2.length);
            c(str, 0, str.length(), 1, true, new yx4(str));
        }
    }
}
