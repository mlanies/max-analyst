package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class r08 extends x1 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public r08(List list) {
        this.b = list;
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                String strGroup = ((Matcher) ((qz7) this.b).b).group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) this.b).get(x53.a0(i, this));
        }
    }

    @Override // defpackage.x1
    public final int getSize() {
        switch (this.a) {
            case 0:
                return ((Matcher) ((qz7) this.b).b).groupCount() + 1;
            default:
                return ((List) this.b).size();
        }
    }

    @Override // defpackage.x1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.a) {
            case 1:
                return new fkc(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.x1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.x1, java.util.List
    public ListIterator listIterator() {
        switch (this.a) {
            case 1:
                return new fkc(this, 0);
            default:
                return super.listIterator();
        }
    }

    public r08(qz7 qz7Var) {
        this.b = qz7Var;
    }

    @Override // defpackage.x1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.a) {
            case 1:
                return new fkc(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
