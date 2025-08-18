package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ai7 implements Iterator, qb7 {
    public String a;
    public boolean b;
    public final /* synthetic */ at c;

    public ai7(at atVar) {
        this.c = atVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.a == null && !this.b) {
            String line = ((BufferedReader) this.c.b).readLine();
            this.a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.a;
        this.a = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
