package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.j0;
import com.my.tracker.obfuscated.u0;

/* loaded from: classes.dex */
final class v0 implements u0 {
    private final j0 a;
    private final String b;

    public static final class a implements u0.a {
        private final j0 a;
        private final j0.d b;

        public a(j0 j0Var, j0.d dVar) {
            this.a = j0Var;
            this.b = dVar;
        }

        @Override // com.my.tracker.obfuscated.u0.a
        public boolean a() {
            return this.b.a();
        }

        @Override // com.my.tracker.obfuscated.u0.a
        public long b() {
            return this.b.b();
        }

        @Override // com.my.tracker.obfuscated.u0.a
        public long c() {
            return this.b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.u0.a
        public u0.b d() {
            return new b(this.a.e(this.b.c()));
        }

        @Override // com.my.tracker.obfuscated.u0.a
        public String j() {
            return this.b.j();
        }
    }

    public static final class b implements u0.b {
        private final j0.e a;

        public b(j0.e eVar) {
            this.a = eVar;
        }

        @Override // com.my.tracker.obfuscated.u0.b
        public boolean a() {
            return this.a.a();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.u0.b
        public boolean e() {
            return this.a.o();
        }

        @Override // com.my.tracker.obfuscated.u0.b
        public long g() {
            return this.a.n();
        }

        @Override // com.my.tracker.obfuscated.u0.b
        public long i() {
            return this.a.m();
        }
    }

    public v0(j0 j0Var, String str) {
        this.a = j0Var;
        this.b = str;
    }

    @Override // com.my.tracker.obfuscated.u0
    public u0.a a() {
        j0 j0Var = this.a;
        return new a(j0Var, j0Var.a(this.b));
    }
}
