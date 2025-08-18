package org.apache.http.impl.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieIdentityComparator;

@Deprecated
/* loaded from: classes2.dex */
public class BasicCookieStore implements CookieStore {
    private final ArrayList<Cookie> cookies = new ArrayList<>();
    private final Comparator<Cookie> cookieComparator = new CookieIdentityComparator();

    @Override // org.apache.http.client.CookieStore
    public synchronized void addCookie(Cookie cookie) {
        if (cookie != null) {
            try {
                Iterator<Cookie> it = this.cookies.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (this.cookieComparator.compare(cookie, it.next()) == 0) {
                        it.remove();
                        break;
                    }
                }
                if (!cookie.isExpired(new Date())) {
                    this.cookies.add(cookie);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addCookies(Cookie[] cookieArr) {
        if (cookieArr != null) {
            for (Cookie cookie : cookieArr) {
                addCookie(cookie);
            }
        }
    }

    @Override // org.apache.http.client.CookieStore
    public synchronized void clear() {
        this.cookies.clear();
    }

    @Override // org.apache.http.client.CookieStore
    public synchronized boolean clearExpired(Date date) {
        boolean z = false;
        if (date == null) {
            return false;
        }
        Iterator<Cookie> it = this.cookies.iterator();
        while (it.hasNext()) {
            if (it.next().isExpired(date)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // org.apache.http.client.CookieStore
    public synchronized List<Cookie> getCookies() {
        return Collections.unmodifiableList(this.cookies);
    }

    public String toString() {
        return this.cookies.toString();
    }
}
