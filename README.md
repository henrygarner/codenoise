# Codenoise

Turn overloaded function arities into beautiful music.

## Usage

Compile codenoise.core

```clojure
(in-ns 'codenoise.core)
```

Pick your function to transcribe into angelic sounds.

```clojure
(map #(beep :duration % :frequency (* 200 %))
  (:arities (function-attributes 'codenoise.core 'bar)))
```

## License

Distributed under the Eclipse Public License, the same as Clojure.
