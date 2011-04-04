//
// Copyright (c) 2011 Three Rings Design, Inc.

// Permission is hereby granted, free of charge, to any person
// obtaining a copy of this software and associated documentation
// files (the "Software"), to deal in the Software without
// restriction, including without limitation the rights to use,
// copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the
// Software is furnished to do so, subject to the following
// conditions:

// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.

// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
// OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
// HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
// WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
// OTHER DEALINGS IN THE SOFTWARE.

package com.threerings.signals;

public class Signal3<Type1, Type2, Type3>
{
    public void dispatch (Type1 arg1, Type2 arg2, Type3 arg3)
    {
        _signaller.dispatch(arg1, arg2, arg3);
    }

    public Connection add (Listener0 l)
    {
        return _signaller.connect(l);
    }

    public Connection add (Listener1<Type1> l)
    {
        return _signaller.connect(l);
    }

    public Connection add (Listener2<Type1, Type2> l)
    {
        return _signaller.connect(l);
    }

    public Connection add (Listener3<Type1, Type2, Type3> l)
    {
        return _signaller.connect(l);
    }

    public void remove (Object l)
    {
        _signaller.disconnect(l);
    }

    protected final Signaller _signaller = new Signaller();
}