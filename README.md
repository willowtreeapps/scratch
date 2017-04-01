[![](https://jitpack.io/v/willowtreeapps/scratch.svg)](https://jitpack.io/#willowtreeapps/scratch)

# Scratch

## What is this for?
Clearing user data and then restarting the app in the foreground. Kind of like starting from scratch. 

## HOW DO
Add the following to your apps `build.gradle`:
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
```groovy
dependencies {
    debugCompile 'com.github.willowtreeapps.scratch:scratchlib:0.1.1'
    releaseCompile 'com.github.willowtreeapps.scratch:scratchlib-no-op:0.1.1'
}
```

Then install the ScratchTile app. 

Add the Scratch Quick Settings Tile to your notification drawer and when you want a fresh slate, press it to clear your app's user data and relaunch (it has to be in the foreground.)

## License
    Copyright 2017 WillowTree, inc
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
