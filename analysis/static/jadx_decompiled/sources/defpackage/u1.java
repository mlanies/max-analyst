package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class u1 implements Iterator, qb7 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ u1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((x1) this.c).getSize()) {
                }
                break;
            case 1:
                if (this.b < ((float[]) this.c).length) {
                }
                break;
            case 2:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
            case 3:
                if (this.b < ((Menu) this.c).size()) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) this.c).getChildCount()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((x1) this.c).get(i);
            case 1:
                try {
                    float[] fArr = (float[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return Float.valueOf(fArr[i2]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return objArr[i3];
                } catch (ArrayIndexOutOfBoundsException e2) {
                    this.b--;
                    throw new NoSuchElementException(e2.getMessage());
                }
            case 3:
                int i4 = this.b;
                this.b = i4 + 1;
                MenuItem item = ((Menu) this.c).getItem(i4);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            default:
                int i5 = this.b;
                this.b = i5 + 1;
                View childAt = ((ViewGroup) this.c).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        e5f e5fVar;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                int i = this.b - 1;
                this.b = i;
                Menu menu = (Menu) this.c;
                MenuItem item = menu.getItem(i);
                if (item != null) {
                    menu.removeItem(item.getItemId());
                    e5fVar = e5f.a;
                } else {
                    e5fVar = null;
                }
                if (e5fVar == null) {
                    throw new IndexOutOfBoundsException();
                }
                return;
            default:
                int i2 = this.b - 1;
                this.b = i2;
                ((ViewGroup) this.c).removeViewAt(i2);
                return;
        }
    }
}
