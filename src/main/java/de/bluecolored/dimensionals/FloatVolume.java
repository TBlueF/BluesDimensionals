/*
 * The MIT License (MIT)
 * 
 * Copyright (c) Blue <https://www.bluecolored.de>
 * Copyright (c) contributors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.bluecolored.dimensionals;

import com.flowpowered.math.vector.Vector3i;

public interface FloatVolume extends Volume<Float> {
	
	@Override
	default Float get(int x, int y, int z) {
		return getFloat(x, y, z);
	}

	default float getFloat(Vector3i pos) {
		return getFloat(pos.getX(), pos.getY(), pos.getZ());
	}

	float getFloat(int x, int y, int z);

	@Override
	default void set(int x, int y, int z, Float value) {
		set(x, y, z, value.floatValue());
	}

	default void set(Vector3i pos, float value) {
		set(pos.getX(), pos.getY(), pos.getZ(), value);
	}
	
	void set(int x, int y, int z, float value);
	
}
